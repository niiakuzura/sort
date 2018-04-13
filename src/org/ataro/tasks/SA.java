package org.ataro.tasks;

import java.util.Scanner;

public class SA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String init = "0.0";
		int count = 0;
		Double sum = 0.0, current = 0.0, sa = 0.0;
		
		while(init.equals(".") != true){
		
			
			current = Double.parseDouble(init);
			sum = sum + current;
			
			System.out.println("Enter your nubmer, or [.], to stop programm");
			init = scan.nextLine();
			
			
			
			
			
			count++;
			System.out.println("number is:" + count);
			
		} 
		sa = sum/--count;
		System.out.println("Your SA:" + sa);

	}

}
