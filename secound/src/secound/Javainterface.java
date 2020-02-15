package secound;



interface persons{
public class Javainterface implements persons  {
	public void subject () {
		System.out.println("This is English student");
	}
	public void studentName() {
		System.out.println("JHON");
		}
	}
	public static void main(String[] args) {
		//Reference type in java which is similar to class
		//it will contains abstract methods. A class will be implemented an interface
		//interface person
		//public void subject();
		//public void studentName();
		
		Javainterface e = new Javainterface();
		e.studentName();
		e.subject();
	}

}
