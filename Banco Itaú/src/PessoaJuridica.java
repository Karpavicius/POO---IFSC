public class PessoaJuridica {

	private PessoaJuridica person;
	private String cnpj;
	
	public void setCnpj (String cnpj) {
		if(ValidateCnpj(cnpj) == true) {
			this.cnpj = cnpj;
		}
	}
	
	public boolean ValidateCnpj (String cnpj) {
		
		this.cnpj = cnpj;
		cnpj.replace(".", "");
		cnpj.replace("-", "");
		cnpj.replace(".", "");
		cnpj.replace("/", "");
		
		int calculation = 0;
		char[]Person = cnpj.toCharArray();
		int value;
		int i;
		int x = 0;
		int y = 0;
		int variable1 = Character.getNumericValue(Person[12]);
		int variable2 = Character.getNumericValue(Person[13]);
		
		if(cnpj == "11111111111111" || cnpj == "22222222222222" ||
				cnpj == "33333333333333" || cnpj == "44444444444444" ||
				cnpj == "55555555555555" || cnpj == "66666666666666" ||
				cnpj == "77777777777777"|| cnpj == "88888888888888" ||
				cnpj == "99999999999999" || cnpj == "00000000000000" ||
				(cnpj.length() != 14)){
			
			System.out.println("The CNPJ is invalid");
				return false;
		}else {
			value = 5;
			for(i=0; i<12; i++) {
				calculation = calculation + ((Character.getNumericValue(Person[i]) * value));
				value--;
				
				if(value == 1) {
					value = 9;
				}
			}
			x = 11-(calculation %11); 
			
			if (x == 10) {
				x = 0;
			}
			
			calculation = 0;
			
			value = 6;
			for(i=0; i<13; i++) {
				calculation = calculation + ((Character.getNumericValue(Person[i]) * value));
				value--;
	
				if(value == 1) {
					value = 9;
				}
			}
			y = 11-(calculation %11);
		
			if (y == 10) {
				y = 0;
				
			}
			
			if(x == variable1 && y == variable2) {
				System.out.println("Valid CNPJ");
				return true;
			}else {
			
				System.out.println("Invalid CNPJ");
				return false;
			}
	}
	}
}