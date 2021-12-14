package business.observer;

import java.io.Serializable;

import business.Pedido;

public class SubjectPedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Observer observer;
	private Pedido pedido;
	
	public SubjectPedido(Pedido pedido) {
		this.observer = new ObserverConcrect(this);
		if (pedido != null)
			this.pedido = pedido;
	}
	
	public void notifyObserver() {
		observer.update();
	}

	public Pedido getPedido() {
		return pedido;
	}
}
