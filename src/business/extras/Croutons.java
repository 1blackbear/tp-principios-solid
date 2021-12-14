package business.extras;

import business.pratos.Prato;

public class Croutons extends IngredienteDecorator {

	private static final long serialVersionUID = 1L;

	public Croutons(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " + Croutons";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 2.0d;
	}
	
	

}
