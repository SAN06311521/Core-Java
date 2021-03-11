import java.io.*;
import java.util.*;

class MaxSumArray {
	public static void main(String args[]) {
		int[] a = {-5, 4, 6, -3, 4, -1};
		System.out.println("Maximum contiguous sum is " + kadane(a));
	}
	
	static int kadane(int a[]) {
		int size = a.length;
		int max = Integer.MIN_VALUE;
		int end = 0;
		for(int i = 0; i < size; i++) {
			end = end + a[i];
			if(max < end) {
				max = end;
			}
			if(end < 0) {
				end = 0;
			}
		}
		return max;
	}
}