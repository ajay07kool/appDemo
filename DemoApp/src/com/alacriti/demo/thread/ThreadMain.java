package com.alacriti.demo.thread;

import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) throws BelowAgeException, OverAgeException {
		Scanner sc = new Scanner(System.in);
		
				int age = sc.nextInt();
				
				if(age < 10){
					
					throw new BelowAgeException("SORRY, YOU ARE UNDER AGE...");					
				}
				else if(age > 50) {
					throw new OverAgeException("SORRY, YOU ARE OVER AGE");
				}
				else{
					System.out.println("Thanks.... YOUR AGE IS BETWEEN THE RANGE.");
				}
	}
}
