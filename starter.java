/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		///////////////ARRAYs////////////////////
		String[] combinations = 
		    {"JXHDL", "QPKYW", "FZBEG", "WOJFA", "UYLSN", "DCKIP", "RTVXM", "HMQNS", "EVRAK", "GIZFC",
            "LOBHD", "YXJET", "AMPVQ", "SWRDN", "NUBKF", "ZGYTR", "QXWVL", "OPLMC", "BKRIJ", "DFMHW",
            "EPCJN", "KTSAZ", "RYNXQ", "VWIUG", "HAXDO", "MJRLE", "YLGZI", "FNPVW", "TZQBR", "UCADK",
            "LWMYG", "IVHTS", "PEKRB", "XYQJO", "GWZAM", "NOYFI", "DKRUB", "ZQMHT", "BYVEX", "AFRCW",
            "TJNPK", "LXQWU", "RZBGY", "WDPAS", "HJOQL", "VMXGN", "SEFKO", "QLYDI", "NZOHA", "CGVUX"};
           
		///////////////STATS////////////////////
		int highScore=0;
		int recentScore=0;
		int orderScore=0;
		int orderTotal=0;
		int cookingScore=0;
		int cookingTotal=3;
		int toppingScore=0;
		int toppingTotal=2;
		///////////////OTHER////////////////////
		Scanner sc=new Scanner(System.in);
		
		///////////////GAME////////////////////
		System.out.println("Welcome to Papa's Pizzeria!");
		System.out.println(" ");
		
			//////////////ORDERING//////////
			System.out.println("A customer! Quick, take their order.");
			System.out.println("Type 'Hello! How can I help you?'");
			while(true){
				System.out.print("You: ");
				String reply=sc.nextLine();
				if(reply.equals("Hello! How can I help you?")){
					orderScore++;
					orderTotal++;
					break;
				}
				orderTotal++;
				System.out.println("Try again.");
			}
			int topping=(int)(Math.random()*9);
			int slices=(int)(Math.random()*5)+1;
			System.out.println("Customer: I want "+slices+" pizza(s) with "+topping+" pepperoni each.");
			System.out.println(" ");
			
			////////////GIVING ORDER///////////
			System.out.println("Let's go to the kitchen!");
			System.out.println("It's time to cook. Solve the following math problems to cook your pizza.");
			
			/////////////COOKING /////////////
			int a=(int)(Math.random()*10)+1;
			int b=(int)(Math.random()*10)+1;
			System.out.print(a+"+"+b+": ");
			int reply1=sc.nextInt();
			if(reply1==(a+b)){
				cookingScore++;
			}
			
			a=(int)(Math.random()*10)+1;
			b=(int)(Math.random()*10)+1;
			System.out.print(a+"*"+b+": ");
			reply1=sc.nextInt();
			if(reply1==(a*b)){
				cookingScore++;
			}
			
			a=(int)(Math.random()*10)+1;
			b=(int)(Math.random()*10)+1;
			System.out.print(a+"%"+b+": ");
			reply1=sc.nextInt();
			if(reply1==(a%b)){
				cookingScore++;
			}
			System.out.println(" ");
			
			/////////////TOPPINGS /////////////
			System.out.println("Now the toppings!");
			System.out.print("How many pepperoni: ");
			int topping1=sc.nextInt();
			System.out.print("How many pizzas: ");
			int slices1=sc.nextInt();
			System.out.println(" ");
			
			if(topping1==topping){
				toppingScore++;
			}
			if(slices1==slices){
				toppingScore++;
			}
			
			/////////////SERVE ////////////////
			Pizza pizza1=new Pizza(topping1);
			int counter3=0;
			while(counter3<slices1){
				pizza1.printPizza();
				counter3++;
			}
			System.out.println(" ");
			
			/////////////SCORE ////////////////
			System.out.println("Congratulations!");
			System.out.println("Order Score: "+orderScore+"/"+orderTotal);
			System.out.println("Cooking Score: "+cookingScore+"/"+cookingTotal);
			System.out.println("Topping Score: "+toppingScore+"/"+toppingTotal);
			
	}
}
