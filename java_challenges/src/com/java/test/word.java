package com.java.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;



public class word {
	public static void main(String[] args) {
		Random r=new Random();
		Permutation p=new Permutation();
		File Word=new java.io.File("Data2.txt");
		HashSet<Character> play_word=new HashSet<Character>();
		char c=(char) (r.nextInt(26)+'a');
		String s="";
//		System.out.println(c);
		for(int i=0;i<5;i++) {
			play_word.add(c);
			while(play_word.contains(c)) {
				c=(char) (r.nextInt(26)+'a');
			}
		}
		for (Character chart : play_word) {
			s+=Character.toString(chart)+" ";
		}
//		System.out.println(s);
		
		if (Word.exists()==false) {
			System.out.println("database not found to play game!!!");
		}
		try {
			Scanner sc=new Scanner(Word);
			System.out.println("System Generate character sequance is: "+s.toUpperCase());
			String in=s.replaceAll(" ","");
			System.out.println(in);
			Scanner input=new Scanner(System.in);
			String n=null;
			HashSet<String> possible=new HashSet<String>();
			HashSet<String> all=new HashSet<String>();
			possible=p.permute(in);
//			System.out.println(possible);
			for (String st1 : possible) {
				for(int i=0;i<st1.length();i++) {
					n=st1.substring(i);
					all.add(n);
				}
			}
			System.out.println("All possibilities of Given String :" +all);
			ArrayList<String> TrueOut=new ArrayList<String>();
			while(sc.hasNext()) {
				String line=sc.nextLine();
				for (String check : all) 
				{
					if(line.toLowerCase().equals(check.toLowerCase())) {
						TrueOut.add(check);
					}
				}
			}
			System.out.println("TrueoutCome of Given String :" +TrueOut);
//			System.out.println("Your Entered: "+U_input);
			
			int j=0;
			while(j<5) {
				System.out.println("Enter any possible combination of: "+"'"+s.toUpperCase()+"'"+"to the check word is in dictionary or not: ");
				String Play_input=input.nextLine();
				if(Play_input.length()<3) {
					System.out.println("Please try with a word containing atleast 3 Characters:");
				}
				else 
				{	
					if(TrueOut.contains(Play_input)) {
					System.out.println("Bingo!!! you have entered Correct Word");
					System.out.println(5-j-1+" More Words to go");
					j++;
					}
					else
					{
						System.out.println("Oops Word does not match with data");
						System.out.println(5-j+" Words to go");
					}
				}
			}
			input.close();
			sc.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}