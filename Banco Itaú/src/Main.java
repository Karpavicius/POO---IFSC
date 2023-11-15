public class Main {
	
	public static void main(String[] args) {
		
		PessoaFisica Ana = new PessoaFisica();
		Ana.setCpf("06373270980");
		PessoaJuridica Laura = new PessoaJuridica();
		Laura.setCnpj("10551469000172");
		
		ContaCorrentePessoaFisica Larissa = new ContaCorrentePessoaFisica(1500.00);
		ContaCorrentePessoaFisica Roberto = new ContaCorrentePessoaFisica(2000.00);
		Funcionario Marcelo = new Funcionario("Marcelo");
		Marcelo.transferenciaCC(Larissa, Roberto, 500.00);
		
		ContaCorrentePessoaJuridica Bruna = new ContaCorrentePessoaJuridica(1000.00);
		ContaCorrentePessoaJuridica Paula = new ContaCorrentePessoaJuridica(2500.00);
		Marcelo.transferenciaCJ(Bruna, Paula, 400.00);
	}
}