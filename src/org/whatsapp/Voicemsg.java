package org.whatsapp;

import java.util.Scanner;

public class Voicemsg extends ChatSetting {
	
	public static void main(String[] args) {
		
		int age =17;
		if (age>=18) {
			System.out.println("person eligible for vote");
		}
		else {
			System.out.println("person not eligible for vote");
		}
		ChatSetting a=new ChatSetting();
		a.sms();
		a.voicmsg();
		int q=10;
		System.out.println("check the a is "+q);
		short s=1234;
		System.out.println("check the S is "+s);
		
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = ab.nextLine();
		System.out.println("my name is  "+name);
		System.out.println("");
		System.out.println("welcome to voting booth");
		System.out.println("Enter your age");
		int are = ab.nextInt();
		if (are>=18) {
			System.out.println("your eligible for vote at "+are);
			
			
		}
		if (are==17) {
			System.out.println("kindly apply for the voter id");
			
		}
		else {
		System.out.println("your not eligible for vote at "+are);
		
		}

}
}