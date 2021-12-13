package business;

import java.util.ArrayList;
import java.util.List;

import business.exception.PedidoException;

public class LEsperaSingleton {
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private static final LEsperaSingleton INSTANCIA = new LEsperaSingleton();
	
	private LEsperaSingleton() {};
	
	public static LEsperaSingleton getInstancia() {
		return INSTANCIA;
	}
	
	public void addPedido(Pedido p) throws PedidoException {
		if (p != null) {
			this.pedidos.add(p);
		} else {
			throw new PedidoException("Não foi possível adicionar à Lista de Espera. (Pedido Nulo)");
		}
	}
	
	public Pedido removePedido(Pedido p) throws PedidoException {
		boolean encontrou = false;
		
		for (Pedido ped : pedidos) {
			if (ped.equals(p)) {
				pedidos.remove(p);
				encontrou = true;
				break;
			}			
		}
		if (!encontrou)
			throw new PedidoException("Não foi possível remover o pedido da lista de espera. (Pedido não encontrado)");
		
		return p;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
