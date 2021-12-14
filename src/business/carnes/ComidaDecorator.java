package business.carnes;

import business.pratos.Prato;

public abstract class ComidaDecorator extends Prato {

	private static final long serialVersionUID = 1L;

	private Prato prato;

	public ComidaDecorator(Prato prato) {
		if (prato == null) {
			throw new RuntimeException("O prato deve ser definido");
		}
		this.prato = prato;

	}

	@Override
	public String getDescricao() {
		return prato.getDescricao();
	}

	@Override
	public double getPreco() {
		return prato.getPreco();
	}

}
