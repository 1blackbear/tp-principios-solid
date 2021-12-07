package business.carnes;

import business.pratos.Prato;

public class CarnePorco extends ComidaDecorator {

	private static final long serialVersionUID = 1L;

	public CarnePorco(Prato prato) {
		super(prato);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " com carne de porco";
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return super.getPreco() + 5.9d;
	}

}
