package business;

import java.util.ArrayList;
import java.util.List;

import business.exception.PedidoException;
import business.observer.SubjectPedido;

public class Pedido {
	private final int num_pedido = gerarNPedido(100000,999999);
	private List<IProduto> combo;
	private SubjectPedido subject_status;
	private String status;
	
	public Pedido() {
		this.combo = new ArrayList<IProduto>();
		this.status = "Pedido Realizado";
		this.subject_status = new SubjectPedido(this);
		this.subject_status.notifyObserver();
	}
	
	public double calcularTotal() {
		double total = 0.0;
		for (IProduto prod : combo) {
			total += prod.getPreco();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("N�mero do pedido: " + num_pedido  +"\n");
		sb.append("Itens: \n");
		for (IProduto prod : combo) {
			sb.append("Descri��o: " + prod.getDescricao() + "\nPre�o: R$"+ prod.getPreco() + "\n");
		}
		sb.append("===================\n");
		sb.append("Valor total: R$" + calcularTotal());
		
		return sb.toString();
	}
	
	private int gerarNPedido(int min, int max){
	    return min + (int)(Math.random() * (max - min));
	}

	public void addProduto(IProduto produto) throws PedidoException {
		if (produto != null) {
			combo.add(produto);
		} else {
			throw new PedidoException("N�o foi poss�vel adicionar ao combo. (Produto Nulo)");
		}
		
	}
	
	public IProduto removeProduto(IProduto produto) {
		IProduto resp = null;
		for (IProduto p : combo) {
			if (p.equals(produto)) {
				combo.remove(produto);
				resp = produto;
				break;
			}	
		}
		return resp;
		
	}
	
	public List<IProduto> getCombo() {
		return combo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		this.subject_status.notifyObserver();
	}

	public int getNum_pedido() {
		return num_pedido;
	}
	
	

}
