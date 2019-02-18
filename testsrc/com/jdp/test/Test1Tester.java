package com.jdp.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.jdp.logic.Test1;

public class Test1Tester {
	Test1 testedClass;

	@Before
	public void setUp() throws Exception {
		testedClass = new Test1();
	}

	@Test
	public void testForLoop() {
		List<String> empNames = new ArrayList<String>();

		empNames.add("Andrew");
		empNames.add("Mohin");
		empNames.add("Rajan");

		empNames.forEach(System.out::println);
	}

	@Test
	public void testTaskTest1() {
		int result = 5;
		int A[] = { -1, 1, 3, 3, 3, 2, 1, 0 };
		assertEquals(result, testedClass.taskTest1(A));

		result = 6;
		A = new int[] { 1, 3, 5, 7, 9 };
		assertEquals(result, testedClass.taskTest1(A));

		result = 3;
		A = new int[] { 7, 7, 7, 7 };
		assertEquals(result, testedClass.taskTest1(A));

		result = 3;
		A = new int[] { 1, 2, 3, 4 };
		assertEquals(result, testedClass.taskTest1(A));
	}
}
