package br.com.ifsc.canoinhas;

import br.com.ifsc.canoinhas.converter.Conversion;

public class Main {

	public static void main(String[] args) {
		String sentence = "SEMPRE ACESSO O DOJOPUZZLES";
		sentence = sentence.toUpperCase();
		Conversion menssage = new Conversion(sentence);
		menssage.converter();
	}

}
