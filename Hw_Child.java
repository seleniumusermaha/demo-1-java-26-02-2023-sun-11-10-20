package hw.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Stack;

public class Hw_Child {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(40);
		a.add(30);
		String string = a.toString();
		for (Integer integer : a) {
			System.out.print(integer);
			System.out.println();

		}

		int z = 5;
		int x = 10;
		z -= 2;
		int min = (z < x) ? z : x;
		System.out.println(min);
		System.out.println(z);
	}
};
