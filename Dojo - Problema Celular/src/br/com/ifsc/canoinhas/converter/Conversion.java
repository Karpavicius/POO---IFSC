package br.com.ifsc.canoinhas.converter;

import br.com.ifsc.canoinhas.converter.Key;

public class Conversion {
	
	private Key[] letter = new Key[9];
	private String number = " ";
	private String menssage;

	public Conversion(String menssage) {
		this.menssage = menssage;
		letter[0] = new Key("ABC", "2");
		letter[1] = new Key("DEF", "3");
		letter[2] = new Key("GHI", "4");
		letter[3] = new Key("JKL", "5");
		letter[4] = new Key("MNO", "6");
		letter[5] = new Key("PQRS", "7");
		letter[6] = new Key("TUV", "8");
		letter[7] = new Key("XWYZ", "9");
		letter[8] = new Key(" ", "0");
		
	}
	
	public void converter() {
		
		int i, j;
		String correspondingNumber;
		
		for(i=0;i<menssage.length();i++) {
			for(j=0;j<9;j++) {
				correspondingNumber=letter[j].letterNumber(menssage.charAt(i));
				if(correspondingNumber!="") {
					if(correspondingNumber.charAt(correspondingNumber.length()-1)==number.charAt(number.length()-1)) {
						number=number.concat("_");
					}
					number=number.concat(correspondingNumber);
				}
			}
		}
		System.out.println(number);
	}

}
