package com.javaproject1;

public class SwitchStatement {
	public static void main(String[]args) {
		int num = 5;
		switch(num) {
		case 0: 
			int a=2;
			System.out.println("value is :"+a*num);
			break;
		case 1:
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		case 3:
			System.out.println("value is 3");
			break;
		case 4:
			System.out.println("value is 4");
		break;
		default:
			System.out.println("num not found");
			break;
			
		}
	}

}
