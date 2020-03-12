package com.insertion.app;

public class main {

	public static void main(String[] args) {

		int[] intArray = {20, 50, -1, 56, -16, 1, 7};
		
		for(int fi = 1 ; fi < intArray.length ; fi++) {
			int newElement = intArray[fi];
			int si;
			
			for(si = fi ; si>0 && intArray[si-1] > newElement ; si--) {
				intArray[si] = intArray[si-1];
			}
			
			intArray[si] = newElement;
		}
		
		for(int fi=0 ; fi<intArray.length ; fi++) {
			System.out.print(intArray[fi] + " ");
		}
		
	}
}
