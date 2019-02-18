package com.jdp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jdp.logic.Test2;
public class Test2Tester {
	Test2 testedClass;
	@Before
	public void setUp() throws Exception {
		testedClass = new Test2();
	}

	@Test
	public void testTaskTest1() {
		int result = 5;
		assertEquals(result, testedClass.taskTest2(5));
	}
}
