package business.extras;

import business.pratos.Prato;

public class CarneExtra extends IngredienteDecorator {

	private static final long serialVersionUID = 1L;

	public CarneExtra(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Carne extra";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 4.0d;
	}

}
