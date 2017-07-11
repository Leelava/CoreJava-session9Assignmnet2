package collections.assignments;

import java.util.HashSet;


public class SetUnion {

	public static void main(String[] args) {
		
	//Create set1 
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ram");
		set1.add("Shyam");
		set1.add("Poorna");
		set1.add("Pragna");
		set1.add("Pratham");
		System.out.println("The first set is");
		System.out.println(set1);
	//Create set2
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Neeraja");
		set2.add("Nirlepa");
		set2.add("Nirmala");
		set2.add("Pratibha");
		set2.add("Pratham");
		System.out.println("The second set is");
		System.out.println(set1);
		
  
		//To form the union of both into set1
		
		set1.addAll(set2);
		
		
		System.out.println("The union of two sets is");
		
			System.out.println(set1);

		
			
		}

	}


