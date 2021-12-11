package business;

import java.util.ArrayList;
import java.util.List;

import business.exception.PedidoException;
import business.observer.SubjectPedido;

public class Pedido {
	private int num_pedido;
	private List<IProduto> combo;
	private SubjectPedido subject_status;
	private String status;
	
	public Pedido() {
		this.combo = new ArrayList<IProduto>();
	}
	
	public double calcularTotal() {
		return 0;
	}
	
	public String exibirExtrato() {
		return "";
	}

	public void addProduto(IProduto produto) throws PedidoException {
		if (produto != null) {
			combo.add(produto);
		} else {
			throw new PedidoException("Não foi possível adicionar ao combo. (Produto Nulo)");
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
	}
	

}
