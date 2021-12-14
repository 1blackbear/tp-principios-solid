package business.pratos;

public class PratoPequeno extends Prato {

	private static final long serialVersionUID = 1L;

	@Override
	public String getDescricao() {
		return  "Tamanho pequeno";
	}

	@Override
	public double getPreco() {
		return 9.9d;
	}

}
