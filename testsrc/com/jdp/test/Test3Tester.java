package com.jdp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jdp.logic.Test3;

public class Test3Tester {
	Test3 testedClass;
	@Before
	public void setUp() throws Exception {
		testedClass = new Test3();
	}

	@Test
	public void testTaskTest1() {
		int result = 5;
		assertEquals(result, testedClass.taskTest3(5));
	}
}
