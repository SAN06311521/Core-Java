class PathMatrix {
	public static void main(String args[]) {
		FindPath obj = new FindPath();
		System.out.println(obj.path(3,3));
	}
}

class FindPath {
	int path(int n, int m) {
		if(n == 1 || m == 1) {
			return 1;
		}
		else {
			return (path(n-1,m) + path(n,m-1));
		}
	}
}