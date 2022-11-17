package jUnitFunctions;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestFunctions junitstr = new jUnitTestFunctions();
		String result = junitstr.addStrings("Software ","Engineering");
		assertEquals ("Software Engineering", result);
	}
}
