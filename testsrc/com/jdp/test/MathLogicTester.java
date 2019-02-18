package com.jdp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jdp.logic.MathLogic;

public class MathLogicTester {
	private MathLogic testedClass;
	@Before
	public void setUp() throws Exception {
		testedClass = new MathLogic();
	}

	@Test
	public void testCyclicRotation() {
		int[] result = {9,7,6,3,8};
		int[] A = {3,8,9,7,6};
		int K = 3;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));

		result = new int[] {3,8,9,7,6};
		A = new int[] {3,8,9,7,6};
		K = 0;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));

		result = new int[] {};
		A = new int[] {};
		K = 3;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));

		result = new int[] {};
		A = new int[] {};
		K = 0;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));
		result = new int[] {};

		result = new int[] {3,8};
		A = new int[] {3,8};
		K = 20;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));

		result = new int[] {8,3};
		A = new int[] {3,8};
		K = 21;
		assertArrayEquals(result, testedClass.cyclicRotation(A, K));
	}
	@Test
	public void testFrogJump() {
		long result = 3; 
		assertEquals(result, testedClass.frogJump(10, 85, 30));
		
		result = 999999999;
		
		assertEquals(result, testedClass.frogJump(1, 1000000000, 1));
	}
	@Test
	public void testOddArray() {
		long result = 7; 
		int[] array1 = {9,3,9,3,9,7,9};
		assertEquals(result, testedClass.oddArray(array1));
		
		result = 1; 
		int[] array2 = {1,9,10,3,9,3,9,10,9};
		assertEquals(result, testedClass.oddArray(array2));
	}
	@Test
	public void testBinaryGap() {
		long result = 5; 
		assertEquals(result, testedClass.binaryGap(1041));
		
		result = 4; 
		assertEquals(result, testedClass.binaryGap(529));

		result = 2; 
		assertEquals(result, testedClass.binaryGap(9));

		result = 0; 
		assertEquals(result, testedClass.binaryGap(15));
	}


	@Test
	public void testSubtract() {
		long result = 23 - 49 -(-1) - 19; 
		assertEquals(result, testedClass.subtract(23, 49,-1, 19));
		
		result = 123 - 49 -(-1) - 19; 
		assertEquals(result, testedClass.subtract(123, 49,-1, 19));
	}
	
	@Test
	public void testAdd() {
		long result = 34 + 45 +(-1) + 5;
		assertEquals(result, testedClass.add(34, 45, -1, 5));
	}

}
