/**
 * @author AXEL
 * Program using some LinkedList methods 
 */
package com.LinkedList.app;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Scanner sn = new Scanner(System.in); 
		
		list.add("Hi world");
		list.add(25);
		list.add(1.5);
		list.add('A');
		
		System.out.println("list: " + list);
		System.out.println("The size of the list is: " + list.size());
		System.out.println("The first element of the list is: " + list.getFirst() + " and the last is: " + list.getLast()); 
		
		System.out.print("Enter a word to add: ");
		String value = "null";
		value = sn.next();
		System.out.print("Enter the index between 0 and " + list.size() + " where the word will be add: ");
		int index = sn.nextInt();
		
		try
		{
			list.add(index, value);
			System.out.println("list: " + list);
		
		}catch(Exception e)
		{
			System.out.println("\nWrong index, the word couldn't be added to the list\n");
		}
		
		System.out.print("The element '1.5' was be removed");
		list.remove(1.5);
		System.out.println("list: " + list);
		
	}

}
