package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	// Collections: To store the more then one value and not requried to mention
	// the size in the list
	// 1. List: its a Interface. we can't possible the create the object from
	// the list.
	// It allowes dupilcates also
	// 1.1 To store the data based on index.
	// 1.2 To Retrivethe data also based on index
	// 1.3 ArrayList();
	// 1.4 LinkedList();
	// Syntax from the list

	// List<DataType> refvar=new ArrayList<DataType>();
	// class //Class
	// 2. Set
	// 3. Map

	public static void main(String[] args) {
		// Type casting between the list and arraylist
		List<String> list = new ArrayList<String>();
		// add to values from the list
		// by useing add() method to store the data from the List
		list.add("Hello");// 0
		list.add("World");// 1
		list.add("Testing");// 2
		list.add("Masters");// 3

		// {"Hello","World","Testing","Masters"}

		// How to retrive the data from the list
		// By useing get()method to retrive the data from the list

		String value = list.get(2);
		System.out.println(value);

		// To find the size of list by useing size() method

		int size = list.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			try {
				System.out.println(list.get(i));
			} catch (Exception e) {
				System.out.println("Index out of bound");
			}
		}

		System.out.println("Hello I am List class");
		// useing remove method to remove the values from the list in perticular
		// index
		list.remove(0);

		size = list.size();
		System.out.println(size);
		// {"Hello","World","Testing","Masters"}
		// final: // {"World","Testing","Masters"}

		for (int i = 0; i < size; i++) {
			try {
				System.out.println(list.get(i));
			} catch (Exception e) {
				System.out.println("Index out of bound");
			}
			// the isEmpty method are used to check the data will be avalabul or
			// not
			list.add(0, "Hyderabad");
			size = list.size();
			System.out.println(size);
			// {"Hello","World","Testing","Masters"}
			// final: // {"World","Testing","Masters"}

			for (int j = 0; i < size; i++) {
				try {
					System.out.println(list.get(j));
				} catch (Exception e) {
					System.out.println("Index out of bound");
				}
			}
			list.removeAll(list);

			boolean status = list.isEmpty();
			if (status) {
				System.out.println("List is empty");
			} else {
				System.out.println("List is not  empty");
			}
		}

	}

}
