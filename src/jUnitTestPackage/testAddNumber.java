package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		//fail("Not yet implemented");
		jUnitFunctions jUnitNumber=new jUnitFunctions();
		int result=jUnitNumber.addNum(100, 200);
		assertEquals(300, result);
	}

}
