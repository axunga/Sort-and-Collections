package com.bubble.app;

public class main {

	public static void main(String[] args) {

		int[] array = {5, 85, -16, 24, 50, 1, 33};
		
		for(int i=1; i<array.length ; i++) {
			for(int j=0; j<i; j++) {
				if(array[j] > array[i]) {
					//swap
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}
		
		for(int i=0; i<array.length ; i++) System.out.print(array[i] + " ");
		
	}
}
