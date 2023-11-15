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
		System.out.println(gibi.getTitulo());
	}

	public Gibi getGibi() {
		return gibi;
	}	
}