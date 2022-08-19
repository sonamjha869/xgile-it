package com.javaproject1;

public class ArraysCode {
	public static void main(String [] args) {
		//char array
		char[] charArr= new char [5];
		//float Array
		float [] floatArr= new float[5];
		boolean[]boolArr= new boolean[5];
		//long Array
		long[] longArr= new long[5];
		//double Array
		double[] doubleArr = new double[5];
		//int Array
		int[]intArr= new int[5];
		
		intArr[0] = 7;
		intArr[1] = 10;
		intArr[2] =15;
		intArr[3]= 20;
		intArr[4] = 25;
		
		System.out.println(intArr[3]);//20
		System.out.println(intArr[4]);//25
		
		System.out.println("length of int Array:"+ intArr.length);
		System.out.println("length of double Array:"+ doubleArr.length);
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
	}

}
