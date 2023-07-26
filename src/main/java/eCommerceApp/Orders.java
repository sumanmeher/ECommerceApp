package eCommerceApp;

import java.util.Scanner;

public class Orders {
	Prod[] buyProd = new Prod[10];
	int proCnt=0;
	Scanner sc = new Scanner(System.in);
	
	void addOrder(Prod p) {
		buyProd[proCnt++]=p;
	}
	
	void showOrder() {
		if(proCnt==0) {
			System.out.println("\033[31m\033[1mNo Item Bought.\033[0m\033[0m");
			return;
		}
		System.out.println();
		System.out.println("Bought Items: ");
		int count =0;
		double sum=0;
		while(buyProd[count]!=null) {
			Prod product = buyProd[count];
			System.out.println((count + 1) + ". Product Name: " + product.getName() + "\n   Price: ₹"
					+ product.getPrice());
			sum=sum+product.getPrice();
			
			count++;
		}
		System.out.println();
		System.out.println("\033[1mTotal price: ₹"+sum+"\033[0m");
		System.out.println();
		
		
	}
	
	
}
