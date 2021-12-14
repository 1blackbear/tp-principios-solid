package business.extras;

import business.pratos.Prato;

public class Chili extends IngredienteDecorator {

	private static final long serialVersionUID = 1L;

	public Chili(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Chilli";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 2.5d;
	}
	
	

}
