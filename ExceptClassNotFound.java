class ExceptClassNotFound {
	public static void main(String args[]) {
		try {
			Class.forName("Sanya"); //class doesn't exists
		}
		catch (ClassNotFoundException e){
			System.out.println("Class is not found. Error caught : " + e);
		}
	}
}