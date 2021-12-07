package business.bebidas;

public class Refrigerante extends Bebida {

	private static final long serialVersionUID = 1L;

	@Override
	public String getDescricao() {
		return "Refrigerante";
	}

	@Override
	public double getPreco() {
		return 5.9d;
	}

}
