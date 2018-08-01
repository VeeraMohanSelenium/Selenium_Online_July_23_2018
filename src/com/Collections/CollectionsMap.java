package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {

	// Map is also Interface, not possible to create the object from the map.
	// we can use put method to add the values from the map
	// useing get mrthod to retrive the data from the map
	// to add the data from the map based on "Key" and "value",Here Key must be
	// in Uniqe, value will be duplicate also allowed.

	// Syntax
	// Map<Datatype,Datatype> refval=new HashMap<Datatype,Datatype>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Typecasting
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Add the data from the map
		map.put(1, "Hello");
		map.put(2, "Hello2");
		map.put(3, "Hello3");
		map.put(4, "Hello4");

		// Retrive thre data

		String val = map.get(3);
		System.out.println(val);
		int size=map.size();
		System.out.println(size);
		for(int i=1;i<=size;i++)
		{
			val = map.get(i);
			System.out.println(val);
		}
		map.replace(3, "Testingmasters");
		System.out.println(map.get(3));
		map.remove(3, "Testingmasters");
		System.out.println(map.get(3));

	}

}
