package estruturas;
import entidades.Pessoa;

public class NoPessoa extends No {
	
	private Pessoa pessoa;	

	public NoPessoa(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	@Override
	public void imprimirNo() {
		System.out.println(pessoa.getNome());
	}

	public Pessoa getPessoa() {
		return pessoa;
	}	
}