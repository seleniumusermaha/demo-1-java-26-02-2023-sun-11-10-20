package hw.java;

public class Hw_Parent1 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}
		System.out.println("PYRAMID");
	}
}
