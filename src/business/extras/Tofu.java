package business.extras;

import business.pratos.Prato;

public class Tofu extends IngredienteDecorator {

	private static final long serialVersionUID = 1L;

	public Tofu(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Tofu";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 2.7d;
	}

	
}
