package com.beck.ArrayDemo2;

import java.util.Random;

public class ArrayDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First we declare our array variable
		int[] myarray = new int[6];
		Random taco = new Random();
		
		//In many cases we will see arrays populated using for statements
		for(int i=0; i<6; i++)
		{
			int randomvalue = taco.nextInt(101);
			myarray[i] = randomvalue;
		}
		//assignment: Print all of the array values using 6 system.out.println statements.
	}

}
