package business.extras;

import business.carnes.ComidaDecorator;
import business.pratos.Prato;

public abstract class IngredienteDecorator extends ComidaDecorator {

	private static final long serialVersionUID = 1L;

	public IngredienteDecorator(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao();
	}

	@Override
	public double getPreco() {
		return super.getPreco();
	}
	
	

}
