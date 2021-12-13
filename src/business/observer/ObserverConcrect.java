package business.observer;

import java.io.IOException;

import business.LEsperaSingleton;
import business.Pedido;
import business.exception.PedidoException;
import dao.PedidoDAO;
import gui.NotificacaoPedido;


public class ObserverConcrect extends Observer {
	
	private static final long serialVersionUID = 1L;

	public ObserverConcrect(SubjectPedido sub) {
		super.subject = sub;
	}

	private void saveToBalanco(Pedido p) {
		try {
			PedidoDAO file = new PedidoDAO("balanco.bin");
			file.add(p);

		} catch (IOException e) {
			e.printStackTrace(System.err);
		}

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
				saveToBalanco(lista_de_espera.removePedido(super.subject.getPedido()));
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
