public class PessoaFisica {

	private PessoaFisica person;
	private String cpf;
	
	public void setCpf (String cpf) {
		if (ValidateCpf(cpf) == true) {
			this.cpf = cpf;
		}

	}
	
	public boolean ValidateCpf (String cpf) {
		
		this.cpf = cpf;
		cpf.replace(".", "");
		cpf.replace("-", "");
		cpf.replace(".", "");
		
		int calculation = 0;
		char[]Human = cpf.toCharArray();
		int value;
		int i;
		int x = 0;
		int y = 0;
		int variable1 = Character.getNumericValue(Human[9]);
		int variable2 = Character.getNumericValue(Human[10]);
		
		if(cpf == "11111111111" || cpf == "22222222222" || 
				cpf == "33333333333" || cpf == "44444444444" ||
				cpf == "55555555555" || cpf == "66666666666" ||
				cpf == "77777777777" || cpf == "88888888888" ||
				cpf == "99999999999" || cpf == "00000000000" ||
				(cpf.length() != 11)) {

			System.out.println("The CPF is invalid");
			return false;
		}else {
			value = 10;
			for(i=0; i<9; i++) {
				calculation = calculation + ((Character.getNumericValue(Human[i]) * value));
				value--;
			}
			x = (calculation*10) %11;
			
			if (x==10) {
				x=0;
			}
			calculation = 0;
			
			value = 11;
			for(i=0; i<10; i++) {
				calculation = calculation + ((Character.getNumericValue(Human[i]) * value));
				value--;
			}
			y = 11-(calculation%11);
			
			if(y==10) {
				y=0;
			}
			if(x == variable1 && y == variable2) {
				System.out.println("Valid CPF");
				return true;
			}else {
			
				System.out.println("Invalid CPF ");
				return false;
			}
		}
	}
}