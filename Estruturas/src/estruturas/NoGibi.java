package estruturas;
import entidades.Gibi;

public class NoGibi extends No {
	
	private Gibi gibi;	

	public NoGibi(Gibi gibi) {
		super();
		this.gibi = gibi;
	}

	@Override
	public void imprimirNo() {
		// TODO gerado pelos professores, que são duas mães pra vocês
	}

	public Gibi getGibi() {
		return gibi;
	}	
}