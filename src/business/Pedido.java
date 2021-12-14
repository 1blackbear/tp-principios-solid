package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import business.exception.PedidoException;
import business.observer.SubjectPedido;

public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
		double total = 0.0d;
		for (IProduto prod : combo) {
			total += prod.getPreco();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número do pedido: " + num_pedido  +"\n");
		sb.append("Itens: \n");
		for (IProduto prod : combo) {
			sb.append("Descrição: " + prod.getDescricao() + "\nPreço: R$"+ prod.getPreco() + "\n");
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
			throw new PedidoException("Não foi possível adicionar ao combo. (Produto Nulo)");
		}
		
	}
	
	public IProduto removeProduto(IProduto produto) throws PedidoException {
		IProduto resp = null;
		for (IProduto p : combo) {
			if (p.equals(produto)) {
				combo.remove(produto);
				resp = produto;
				break;
			}	
		}
		if (resp == null)
			throw new PedidoException("Não foi possível remover do combo. (Produto não encontrado)");
		
		return resp;
		
	}
	
	public List<IProduto> getCombo() {
		return combo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) throws PedidoException {
		if (status.equals("Pedido Realizado") || status.equals("Pedido Retirado") ||  status.equals("Pedido Pronto")) {
			this.status = status;
			this.subject_status.notifyObserver();
		} else {
			throw new PedidoException("Não foi possível alterar o status. (Status inválido)");
		}
	}

	public int getNum_pedido() {
		return num_pedido;
	}
	
	

}
