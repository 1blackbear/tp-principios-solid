package business.pratos;

public class PratoGrande extends Prato {
	private static final long serialVersionUID = 1L;

	@Override
	public String getDescricao() {
		return "Tamanho Grande";
	}

	@Override
	public double getPreco() {
		return 15.9d;
	}

}
