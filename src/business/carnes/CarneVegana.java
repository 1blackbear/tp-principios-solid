package business.carnes;

import business.pratos.Prato;

public class CarneVegana extends ComidaDecorator {

	private static final long serialVersionUID = 1L;

	public CarneVegana(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " vegana";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 3.9d;
	}

}
