package com.jdp.logic;

public class MathLogic implements Adder, Subtractor {

	
	public int[] cyclicRotation(int[] A, int K) {
		if (K == 0 || A.length == 0)
			return A;
//		while (K >= A.length) {
//			K -= A.length;
//		}
		if (K > A.length)
			K = K % A.length;
		if (K == 0) {
			return A;
		}
		int[] result = new int[A.length];
		System.arraycopy(A, A.length-K, result, 0, K);
		System.arraycopy(A, 0, result, K, A.length-K);
		
		return result;
    }

	public int frogJump(int X, int Y, int D) {
		int result = 0;

		int diff = Y - X;
		result = diff / D;
		int mod = diff % D;
		if (mod != 0)
			result++;
		return result;
    }

	public int oddArray(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] !=  0) {
				for (int j = i + 1; j < A.length; j++ ) {
					if (A[i] == A[j]) {
						A[i] = 0;
						A[j] = 0;
					}
				}
				if (A[i] != 0) {
    				result = A[i];
    				break;
				}
			}
		} 
//		for (int e : A) {
//			if (e != 0) {
//				result = e;
//				break;
//			}
//		}
		return result;
    }
	public int binaryGap(int N) {
		int result = 0;
		char[] chBinary = Integer.toBinaryString(N).toCharArray();

		int iCnt = 0;
		for (char ch : chBinary) {
			if (ch == '0') {
				iCnt++;
			}
			else {
				if (iCnt > result)
					result = iCnt;
				iCnt = 0;
			}
		}
		return result;
	}
	@Override
	public long subtract(long... args) {
		long result = args[0];
		for (int i = 1; i < args.length; i++) {
			result -= args[i]; 
		}
		return result;
	}

	@Override
	public long add(long... args) {
		long result = 0;
		for (long arg : args) {
			result += arg;
		}
		return result;
	}

}
