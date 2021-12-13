package business.observer;

import business.LEsperaSingleton;
import business.exception.PedidoException;

public class ObserverConcrect extends Observer {
	
	@Override
	public void update() {
		LEsperaSingleton lista_de_espera = LEsperaSingleton.getInstancia();
		try {
			if (super.subject.getPedido().getStatus() == "Pedido Realizado") {
				lista_de_espera.addPedido(super.subject.getPedido());
			} else {
				lista_de_espera.removePedido(super.subject.getPedido());
			}
		} catch (PedidoException e) {
			e.printStackTrace();
		}
	}
	
}
