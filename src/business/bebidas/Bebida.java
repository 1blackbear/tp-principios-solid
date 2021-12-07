package business.bebidas;

import business.IProduto;

public abstract class Bebida implements IProduto {
	private static final long serialVersionUID = 1L;

	@Override
	public abstract String getDescricao();

	@Override
	public abstract double getPreco();

}
