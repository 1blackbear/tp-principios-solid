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
	
	public Pedido removePedido(Pedido p) {
		for (Pedido ped : pedidos) {
			if (ped.equals(p)) {
				pedidos.remove(p);
				break;
			}
				
		}
		return p;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
