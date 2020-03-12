package com.selection.app;

public class main {

	public static void main(String[] args) {

		int[] array = {50, 3 2, 32, -16, 80, -1};
		
		for(int last=array.length-1 ; last>0 ; last--) {
			
			int largest = 0;
			
			for (int i = 0 ; i<=last ; i++) {
				if(array[i] > array[largest]) {
					largest = i;
				}
			}
			
			//swap
			int aux = array[last];
			array[last] = array[largest];
			array[largest] = aux;
			
		}
		
		for(int i=0 ; i<array.length ; i++) System.out.print(array[i] + " ");
		
	}
}
