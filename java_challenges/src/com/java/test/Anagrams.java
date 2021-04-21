package com.java.test;

import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		boolean b=false;
		String condition="yes";
		Scanner sc= new Scanner(System.in);
		while(condition.equals("yes"))
		{
			System.out.print("Enter First String: ");
			String s1=sc.nextLine();
			System.out.print("Enter Second String: ");
			String s2=sc.nextLine();
			if(s1.length()!=s2.length()) {
			System.out.println("Both Strings Are Not anagrams bcz have different Sizes");
			}
			else {
				for(int i=0;i<s1.length()-1;i++) {
					if(s1.toLowerCase().charAt(0) ==s2.toLowerCase().charAt(s2.length()-1)){
						b=true;
					}
				}
			}
			if(b==true) {
				System.out.println("Strings are Anagrams");
			}
			else {
				System.out.println("Strings are not Anagrams");
			}
			System.out.println("Do you want To Continue:");
			condition=sc.nextLine();
		}
		System.out.println("Thank you for playing");
		sc.close();
	}

}
