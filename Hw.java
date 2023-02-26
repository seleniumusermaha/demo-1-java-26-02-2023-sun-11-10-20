package hw.java;

import java.util.Iterator;
import java.util.Scanner;

public class Hw {
	
	//edited in git 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();String c = sc.next();int b = sc.nextInt();
		if (c.equals("+")) {
			int e = a + b;
			System.out.println("--");
			System.out.println(e);
			System.out.println("--");
		}
		if (c.equals("-")) {
			int e = a - b;
			System.out.println("--");
			System.out.println(e);
			System.out.println("--");
		}
		if (c.equals("*")) {
			int e = a * b;
			System.out.println("--");
			System.out.println(e);
			System.out.println("--");
		}
		if (c.equals("/")) {
			int e = a / b;
			System.out.println("--");
			System.out.println(e);
			System.out.println("--");

		}
		if (c.equals("%")) {
			int e = a % b;
			System.out.println("--");
			System.out.println(e);
			System.out.println("--");
		}

		/*
		 * switch (c) { case "+": int d = a+b; break; case "-": int d = a-b; break; case
		 * "*": int d = a+b; break;
		 * 
		 * default: break; }
		 */

	}
}
