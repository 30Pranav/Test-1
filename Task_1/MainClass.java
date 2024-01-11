package com.ShoppingProject;

import static java.lang.System.in;

/*
 * @author
 * date:20/12/2023
 * Main class of the project
 * calling the methods of class 
 * Register,Login,Category,Product
 */
import java.util.Scanner;

/**@author pranav
 * 
 */
public class MainClass {

	// main method of class
	public static void main(String[] args) {

		Product product = new Product();// object of Product class
		Purchase purchase = new Purchase(); // object of Purchase class
		Login login = new Login(); // object of Login class

		System.out.println("welcome to assort shoppingcenter");
		System.out.println("To start the shopping :");
		System.out.println("1:Register");
		System.out.println("2:Login");
		System.out.println("3:Login as Admin");

		Scanner scanner = new Scanner(in);

		int i = scanner.nextInt();
		switch (i) {
		case 1: {
			login.register();// calling the method register
			product.showCategory();// calling the method showCatagory
			product.showProduct();// calling the method showProduct
			purchase.purchaseProduct();// calling the method purchaseProduct
			break;
		}
		case 2: {
			int x = login.login();
			if (x == 1) {
				product.showCategory();// calling the method showCtagory
				product.showProduct();// calling the method showProduct
				purchase.purchaseProduct();// calling the method purchaseProduct
				
			} else {
				System.out.println("Enter the right credentilals");
				int y = login.login();
				if (y == 1) {
					product.showCategory();// calling the method showCtagory
					product.showProduct();// calling the method showProduct
					purchase.purchaseProduct();// calling the method purchaseProduct
				}
			}
              break;
		}
		case 3: {

			Admin admin = new Admin();
			int ad = admin.adminLogin();
			if (ad == 1) {
				admin.adminOption();
			//	admin.adminLogin();
				
			}
		}

		}
	}
}
