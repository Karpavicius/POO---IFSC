package swtesting1;

public class VarNameEval {
	public boolean isValid(String varName) {
			
		if(Character.isLetter(varName.charAt(0))==true) {
			if(!Character.isLowerCase(varName.charAt(0)))
				return false;
		}
		
		if(Character.isUpperCase(varName.charAt(0))==true) {
			if(!Character.isUpperCase(varName.charAt(0)))
				return false;
		}
		
		if(!varName.matches("[a-zA-Z0-9]+"))
			return false;			
		
		return true;
	}
}
