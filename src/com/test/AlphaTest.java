package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlphaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> arrayList = new ArrayList<>();
		/*
		 * arrayList.add('a'); arrayList.add('b'); arrayList.add('c');
		 * arrayList.add('d'); arrayList.add('e'); arrayList.add('f');
		 * arrayList.add('g'); arrayList.add('h'); arrayList.add('i');
		 * arrayList.add('j'); arrayList.add('k'); arrayList.add('l');
		 * arrayList.add('m'); arrayList.add('n'); arrayList.add('o');
		 * arrayList.add('p'); arrayList.add('q'); arrayList.add('r');
		 * arrayList.add('s'); arrayList.add('t'); arrayList.add('u');
		 * arrayList.add('v'); arrayList.add('w'); arrayList.add('x');
		 * arrayList.add('y'); arrayList.add('z');
		 */
		
		char ch;
		for (ch = 'a'; ch <= 'z'; ch++)
			arrayList.add(ch);
		

		String input = "yuvaraj";
		String input2 = "abcdefghijklmnopqrstuvwxyz";
		// System.out.println(arrayList.contains(input));

		int length = input.length();

		int expect = 26;
		int actual = 0;
		Iterator it = arrayList.iterator();

		while (it.hasNext()) {
			if (input.contains(String.valueOf(it.next()))) {
				actual++;
				//System.out.println(actual);
			}
		}
		//System.out.println(actual);
		if (actual == 26)
			System.out.println("Input has all alpha");
		else
			System.out.println("not having all alpha");

	}

}
