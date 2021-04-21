package com.java.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams2 {
	public static void main(String[] args) {
		String condition="yes";
		Scanner sc= new Scanner(System.in);
		while(condition.equals("yes"))
		{
			boolean b=false;
			ArrayList<Character> str = new ArrayList<Character>();
			ArrayList<Character> str2=new ArrayList<Character>();
			System.out.print("Enter First String: ");
			String s1=sc.nextLine().toLowerCase();
			System.out.print("Enter Second String: ");
			String s2=sc.nextLine().toLowerCase();
			
			if(s1.length()!=s2.length()) {
				System.out.println("Both Strings Are Not anagrams bcz have different Sizes");
			}
			else {
				if(s1.length()%2!=0) {
				System.out.println("Both Strings Are Not anagrams as they can not be in same frequency");
				
				}
				char[] ch1=s1.toCharArray();
				char[] ch2=s2.toCharArray();
				System.out.println(ch1);
				System.out.println(ch2);
				for(int i=0;i<s1.length()/2;i++) {
					
					if(ch1[i] ==ch1[(ch1.length)-(i+1)] && ch2[i] ==ch2[(ch2.length)-(i+1)]){
						str.add(ch1[i]);
						str2.add(ch2[i]);
					}
				}
//				System.out.println(str);
//				System.out.println(str2);
				if(str.containsAll(str2) && str.size()==(s1.length()/2) && str.size()>0) {
					b=true;
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