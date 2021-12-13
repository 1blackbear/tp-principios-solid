package business.observer;

import business.LEsperaSingleton;
import business.exception.PedidoException;
import gui.NotificacaoPedido;

public class ObserverConcrect extends Observer {
	
	public ObserverConcrect(SubjectPedido sub) {
		super.subject = sub;
	}
	
	@Override
	public void update() {
		LEsperaSingleton lista_de_espera = LEsperaSingleton.getInstancia();
		try {
			String status = super.subject.getPedido().getStatus();
			switch(status) {
			case "Pedido Realizado":
				lista_de_espera.addPedido(super.subject.getPedido());
				break;
			case "Pedido Retirado":
				lista_de_espera.removePedido(super.subject.getPedido());
				break;
			case "Pedido Pronto":
				NotificacaoPedido janelaP = new NotificacaoPedido("O PEDIDO " + super.subject.getPedido().getNum_pedido() + " ESTÁ PRONTO!");
				janelaP.setVisible(true);	
				break;
			default:
				break;
			}
		} catch (PedidoException e) {
			e.printStackTrace();
		}
	}
	
}
