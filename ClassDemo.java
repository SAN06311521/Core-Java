class Box{
	int width, height, depth;
	void volume(int w, int h, int d){
		width = w;
		height = h;
		depth = d;
		System.out.println("Volume = " + (width*height*depth));
	}

}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box();
		b1.volume(1,2,3);
		b2.volume(10,20,30);
	}
}