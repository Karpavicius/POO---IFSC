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
		// TODO gerado pelos professores, que são duas mães pra vocês
	}

	public Pessoa getPessoa() {
		return pessoa;
	}	
}