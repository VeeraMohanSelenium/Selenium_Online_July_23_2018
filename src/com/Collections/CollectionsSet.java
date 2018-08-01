package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {
	//Set: is alseo Interface ,here not possible to create the object from the set
	//Set is not allowed the duplicate values
	//add method are used to add the values.
	//we can use foreach loop to retrive the data from the Set.
	//Syntax
	// Set<DataType> set=new HashSet<DataType>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TypeCasting
		Set<Integer> val=new HashSet<Integer>();
		
		val.add(2);
		val.add(4);
		val.add(2);
		val.add(5);
		
		
		for (Integer i : val) {
			System.out.println(i);
		}
		int size=val.size();
		System.out.println(size);
		

	}

}
