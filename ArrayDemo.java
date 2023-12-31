
import java.util.ArrayList;
public class ArrayDemo {
	public static void main(String[] args) {
		GenericArray arrayDem = new GenericArray(5);
		
		arrayDem.set(0, 15);
		arrayDem.set(1, 10);
		arrayDem.set(2, 5 );
		arrayDem.set(3, 0);
		arrayDem.set(4, -5);
		
		//print out the array
		System.out.println("These are the values in my array:");
		for(int i = 0; i < arrayDem.size() ; i++) {
			System.out.println(arrayDem.get(i));
		}
		
		//modify the array
		
		arrayDem.set(1, 20);
		arrayDem.set(2, 25);
		arrayDem.set(3, 30);
		arrayDem.set(4, 35);
		
		//reprint the array
		
		System.out.println("This is the array modified");
		for (int i = 0; i < arrayDem.size(); i++)
			System.out.println(arrayDem.get(i));
		
		//check the size of array and if it is empty
		
		if(arrayDem.isEmpty()) {
			System.out.println("There is no elements in this array");
		} else {System.out.println("This array is full");
			      System.out.println("There are " + arrayDem.size() + " elements in the array."); }
	

	GenericArray arrayDem2 = new GenericArray(5);
	
		arrayDem2.set(0, "Aliza");
		arrayDem2.set(1, "Ahuva");
		arrayDem2.set(2, "Aryeh" );
		arrayDem2.set(3, "Adeena");
		arrayDem2.set(4, "Tamar");
		
		//print out the array
				System.out.println("These are the values in my String array:");
				for(int i = 0; i < arrayDem2.size() ; i++) {
					System.out.println(arrayDem2.get(i));
				}
		
	   //modify the array
				
	   arrayDem2.set(0,"Aliza and Yaakov");
	   arrayDem2.set(2, "Aryeh and Shaindy");
	   arrayDem2.set(4, "Tamar and Yehuda");
	   
	   System.out.println("These are the new values in my String array:");
		for(int i = 0; i < arrayDem2.size() ; i++) {
			System.out.println(arrayDem2.get(i));
		}
		
		//Check if the array is empty.
		
		if(arrayDem2.isEmpty()) {
			System.out.println("There is no elements in this array");
		} else {System.out.println("This array is full");
			      System.out.println("There are " + arrayDem2.size() + " elements in the array."); }
	
	}
}
