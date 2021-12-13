package business.observer;

import business.Pedido;

public class SubjectPedido {
	private Observer observer;
	private Pedido pedido;
	
	public SubjectPedido(Pedido pedido) {
		this.observer = new ObserverConcrect();
		this.pedido = pedido;
	}
	
	public void notifyObserver() {
		observer.update();
	}

	public Pedido getPedido() {
		return pedido;
	}
}
