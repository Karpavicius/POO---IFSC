public class Funcionario {
	
	private String name;
	public Funcionario(String name) {
		this.name = name;
	}
	
	public void transferenciaCC (ContaCorrentePessoaFisica Larissa, ContaCorrentePessoaFisica Roberto, double value) {
		Larissa.withdraw(value);
		Roberto.deposit(value);
		System.out.println("Transfer made by: " + this.name);
	}
	
	public void transferenciaCJ (ContaCorrentePessoaJuridica Bruna, ContaCorrentePessoaJuridica Paula, double value) {
		Bruna.withdraw(value);
		Paula.deposit(value);
		System.out.println("Transfer made by: " + this.name);
	}
}