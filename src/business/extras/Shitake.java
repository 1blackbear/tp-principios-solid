package business.extras;

import business.pratos.Prato;

public class Shitake extends IngredienteDecorator {

	private static final long serialVersionUID = 1L;

	public Shitake(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Shitake";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 6.9d;
	}
	
	

}
