package business.pratos;

import business.IProduto;

public abstract class Prato implements IProduto {

	private static final long serialVersionUID = 1L;

	@Override
	public abstract String getDescricao();

	@Override
	public abstract double getPreco() ;

}
