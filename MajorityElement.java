import java.io.*;

class MajorityElement {
	void printMajority(int a[], int size) {
		int candidate = majority(a, size);
		if(isMajority(a, size, candidate)) {
			System.out.println(candidate);
		}
		else {
			System.out.println("No majority element present!");	
		}
	}

	int majority(int a[], int size) {
		int ans_index = 0;
		int count = 1;
		for(int i = 1; i < size; i++) {
			if(a[ans_index] == a[i]) {
				count++;
			}	
			else {
				count--;
			}
			if(count == 0) {
				ans_index = i;
				count = 1;
			}
		}
		return a[ans_index];
	}

	boolean isMajority(int a[], int size, int candidate) {
		int count = 0;
		for(int i = 0; i < size; i++) {
			if(a[i] == candidate) {
				count++;
			}
		}
			if(count > size/2) {
				return true;
			}
			else {
				return false;
			}
	}

	public static void main(String args[]) {
		MajorityElement obj = new MajorityElement();
		int a[] = new int[] {1, 1, 1, 3, 2};
		int size = a.length;
		obj.printMajority(a, size);
	}
}