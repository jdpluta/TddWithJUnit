package com.jdp.logic;

public class Test1 {

	public int taskTest1(int[] A) {
		int result = 0;
		if (A == null || A.length < 3)
			return result;
		int sliceLength = 2;

		for (int i = 2; i < A.length; i++) {
			if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
				sliceLength++;
			} 
			else {
				if (sliceLength > 2) {
					result += calculateSlices(sliceLength);
				}
				sliceLength = 2;
			}
		}
		if (sliceLength > 2)
			result += calculateSlices(sliceLength);

		return result;
	}

	private int calculateSlices(int len) {
        return (len - 1) * (len - 2) / 2;
    }
}
