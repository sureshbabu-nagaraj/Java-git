package org.whatsapp;

import java.util.Scanner;

public class VoterDetails {
	
	public static void main(String[] args) {
		
	
	
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter your name");
	String name = ab.nextLine();
	System.out.println("Hello "+name);
	System.out.println("");
	System.out.println("welcome to voting booth");
	System.out.println("");
	System.out.println("enter your country");
	String country = ab.nextLine();
	System.out.println("Welcome to booth no 3 ");
	System.out.println("");
	
	
	System.out.println("Enter your age");
	int are = ab.nextInt();
	if (are>=18) {
		System.out.println("");
		
		
	}
	if (are==17) {
		System.out.println("kindly apply for the voter id");
		
	}
	else {
	System.out.println("your not eligible for vote at "+are);
	
	}


}}

