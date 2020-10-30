package firstpackage;

import java.util.Scanner;


public class Feature {

	public static void main(String[] args) {
		System.out.println("My Commit from Feature Branch");
		System.out.println("Feature branch next commit");
		System.out.println("This is done on remote");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your First name");
		String name2 = scan.next().trim();
		System.out.println(name2);
		for(int i =0; i<10; i++){
		System.out.println("Hello");
		}
		
		
	}

}
