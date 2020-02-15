package secound;

public class fiveclssarray {

	public static void main(String[] args) {
		// Array container that data/value single type
		//store multiple values in single variables
		//limitations: Sizing & type issue
		//(Note: if you use dynamic array these limitations can be overcome.
		//initialize the array and set its size (array =new array[3];
		String [] names =new String [4];
		names[0]="Ali";
		names[1]="Abbas";
		names[2]="Amir";
		names[3]="12.56";
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		for (int i=0;i<names.length;i++);
		{
			System.out.println(names[i]);
		}*/
		
		for (String str : names)
		{
			System.out.println(str);
		}
	}

}
