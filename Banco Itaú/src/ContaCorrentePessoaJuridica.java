public class ContaCorrentePessoaJuridica {
	
	private double balance;
	
	public ContaCorrentePessoaJuridica(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double withdraw) {
			if(withdraw < 0){
				System.out.println("Invalid operation");
				
			}else if(withdraw > this.balance) {
				System.out.println("Invalid operation");
				
			}else if(withdraw > 1000) {
				System.out.println("Invalid operation");
				
			}else {
				this.balance = this.balance - withdraw;
				System.out.println("Current balance: " + this.balance);
			}
		}

	public void deposit(double deposit) {
			if(deposit < 0) {
				System.out.println("Invalid operation");
				
			}else if (deposit > 1000){
				System.out.println("Invalid operation");
				
			}else {
				this.balance = this.balance + deposit;
				System.out.println("Successful operation. Current balance: " + this.balance);
			}
		}
}