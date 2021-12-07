package business.pratos;

public class PratoMedio extends Prato {

	private static final long serialVersionUID = 1L;

	@Override
	public String getDescricao() {
		return "Tamanho Médio";
	}

	@Override
	public double getPreco() {
		return 12.9d;
	}

}
