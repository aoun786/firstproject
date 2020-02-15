package secound;

import java.util.ArrayList;

public class DynamicArr {

	public static void main(String[] args) 
	//Arraylist is built Java function
	{
		ArrayList myArr= new ArrayList();
	//Add object e is a built is method
		myArr.add(12);//0
		myArr.add("Choudhary");//1
		myArr.add(true);//2
		myArr.add(12.54);//3
		
		//System.out.println(myArr.get(2));
		myArr.remove(2);// to remove any index from Array
		System.out.println(myArr);
	}

}
