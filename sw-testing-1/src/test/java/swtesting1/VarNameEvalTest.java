package swtesting1;

import static org.junit.Assert.assertEquals; // imports the static method assertEquals from Assert class

import org.junit.Test;

import swtesting1.VarNameEval;

public class VarNameEvalTest {
	
	@Test
	public void falseNullCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid(" ");
		assertEquals(false, result);
	}

	@Test // a test case method must return void and have no arguments
	public void trueFirstLowerCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("a");
		assertEquals(true, result);
	}

	@Test
	public void falseFirstLowerCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("A");
		assertEquals(false, result);
	}
	
	@Test
	public void trueFirstNumberCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("1aaa");
		assertEquals(true, result);
	}
	
	@Test
	public void falseCharacterCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("ç");
		assertEquals(false, result);
	}
	
	@Test
	public void falseSpaceCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("a a");
		assertEquals(false, result);
	}
	
	@Test
	public void trueNumberCase() {
		VarNameEval varNameEval = new VarNameEval();
		boolean result = varNameEval.isValid("1234");
		assertEquals(true, result);
	}
}
