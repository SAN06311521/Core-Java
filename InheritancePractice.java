class Student {
   String section = "C";
   String collegeName = "IIPS";
   void method(){
	System.out.println("Learning");
   }
}

class InheritStudent extends Student{
   String mainSubject = "Computer";
   public static void main(String args[]){
	InheritStudent obj = new InheritStudent();
	System.out.println(obj.collegeName);
	System.out.println(obj.section);
	System.out.println(obj.mainSubject);
	obj.method();
   }
}