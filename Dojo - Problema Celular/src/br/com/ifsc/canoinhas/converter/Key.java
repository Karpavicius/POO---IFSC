package br.com.ifsc.canoinhas.converter;

public class Key {
	private String letter;
	private String number;

	public Key(String letter, String number) {
		this.letter = letter;
		this.number = number;
		
	}
	
	public String letterNumber(char let) {
		int i, j;
		String correspondingNumber ="";
		for(i=0;i<letter.length();i++) {
			if(let==letter.charAt(i)) {
				for(j=0;let!=letter.charAt(j);j++) {
					correspondingNumber = correspondingNumber.concat(number);
				}
				return correspondingNumber.concat(number);
			}
		}
		return "";
	}

}
