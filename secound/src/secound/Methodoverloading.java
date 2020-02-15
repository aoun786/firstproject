package secound;

	class Methodoverrings{
		void show ()
		{
			
			System.out.println("Animal show");
		}
	}
	//inherited class
	class child extends Methodoverrings{
		@Override
		void show()
		{
			System.out.println("Animal child show");
		}
		
	}
	
 class Test{
	
	public static void main(String[] args) {
		//is a feature that allows a subclass or child class
		// to provide a specific implementation of a method
		//Methodoverrings is referenceing to parent object,then
		//parents show() method is callled
		Methodoverrings obj1= new Methodoverrings();
		Methodoverrings obj2= new Methodoverrings();
		child obj3= new child (); //child class
		obj1.show();
		//if the Methodoverrings referenceing to child object, show()
		// method is called this is during run time of Polymarphise
		obj2.show();
	}
	}
