package business.observer;

import java.io.Serializable;

public abstract class Observer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected SubjectPedido subject;
	
	public void update() {};
}
