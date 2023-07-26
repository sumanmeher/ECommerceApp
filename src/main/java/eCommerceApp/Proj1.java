package eCommerceApp;

import java.util.Scanner;

public class Proj1 {

	public static void main(String[] args) {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		String name = sc.nextLine();
		u.setName(name);
		EComApp e = new EComApp();

		System.out.println("Hello \033[1m" + u.getName() + "\033[0m, Welcome to our E-Commerce App.");
		e.appRun();
		sc.close();
	}

}
