package com.test;

public class test2 extends First {
	public test2(int index) {
		index = index;
		System.out.println(" inside child class contructor ## " +index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t2 = new test2(10);
		System.out.println(t2.index);
		
		int i =1;
		if(i==1)
			System.out.println("its true odd number");
		else
			System.out.println("its false even number");

	}

}

class First {
	int index = 1;
}