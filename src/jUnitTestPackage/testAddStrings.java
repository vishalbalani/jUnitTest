package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		//fail("Not yet implemented");
		jUnitFunctions jUnitStrings=new jUnitFunctions();
		String result=jUnitStrings.addStr("Hello ", "World");
		assertEquals("Hello World", result);
	}

}
