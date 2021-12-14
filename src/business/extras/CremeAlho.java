package business.extras;

import business.pratos.Prato;

public class CremeAlho extends IngredienteDecorator {
	private static final long serialVersionUID = 1L;

	public CremeAlho(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Créme Alho";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 1.5d;
	}

}
