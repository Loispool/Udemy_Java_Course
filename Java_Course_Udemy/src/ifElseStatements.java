
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ifElseStatements {
	
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Pick a number between 1-100");
	
		int x = scan.nextInt();
		
		if(x >= 1 && x <= 100){
			System.out.println("Great Number");
		}else{
			System.out.println("You're a bitch");
		}
	
		/*
		if(x == 0){
			System.out.println("LOuise");
		} else{
			System.out.println("Ambaho mo naman");
		}
*/
		
		
	}
	
}
