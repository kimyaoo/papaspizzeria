/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pizza {
	String[][] arr = new String[5][5];
	
	public Pizza(int ingredients) {
		arr[0][0]="  ";
		arr[0][1]="⚪";
		arr[0][2]="⚪";
		arr[0][3]="⚪";
		arr[0][4]="  ";
	
		arr[1][0]="⚪";
		arr[1][1]="🔴";
		arr[1][2]="🔴";
		arr[1][3]="🔴";
		arr[1][4]="⚪";
		
		arr[2][0]="⚪";
		arr[2][1]="🔴";
		arr[2][2]="🔴";
		arr[2][3]="🔴";
		arr[2][4]="⚪";
		
		arr[3][0]="⚪";
		arr[3][1]="🔴";
		arr[3][2]="🔴";
		arr[3][3]="🔴";
		arr[3][4]="⚪";
		
		arr[4][0]="  ";
		arr[4][1]="⚪";
		arr[4][2]="⚪";
		arr[4][3]="⚪";
		arr[4][4]="  ";
		
		if(ingredients>=1){
			arr[1][1]="⭕";
		}
		if(ingredients>=2){
			arr[1][2]="⭕";
		}
		if(ingredients>=3){
			arr[1][3]="⭕";
		}
		if(ingredients>=4){
			arr[2][1]="⭕";
		}
		if(ingredients>=5){
			arr[2][2]="⭕";
		}
		if(ingredients>=6){
			arr[2][3]="⭕";
		}
		if(ingredients>=7){
			arr[3][1]="⭕";
		}
		if(ingredients>=8){
			arr[3][2]="⭕";
		}
		if(ingredients>=9){
			arr[3][3]="⭕";
		}
	}
	
	public void printPizza(){
		int counter=0;
		while(counter<arr.length){
			//goes through each row
			int counter2=0;
			while(counter2<arr[0].length){
				System.out.print(arr[counter][counter2]);
				counter2++;
			}
			System.out.println(" ");
			counter++;
		}
		System.out.println(" ");
	}

}
