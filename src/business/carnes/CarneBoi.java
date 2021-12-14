package business.carnes;

import business.pratos.Prato;

public class CarneBoi extends ComidaDecorator {

	private static final long serialVersionUID = 1L;

	public CarneBoi(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " com carne de boi";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 7.9d;
	}

}
