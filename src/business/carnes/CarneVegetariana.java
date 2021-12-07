package business.carnes;

import business.pratos.Prato;

public class CarneVegetariana extends ComidaDecorator {

	private static final long serialVersionUID = 1L;

	public CarneVegetariana(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " vegetariano";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 3.9d;
	}

}
