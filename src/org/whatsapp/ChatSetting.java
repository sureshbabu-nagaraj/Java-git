package org.whatsapp;

public class ChatSetting {
	
	public void sms() {
		System.out.println("type the msg");

	}
	public void voicmsg() {
		System.out.println("record the voice msg");
	}
	public static void main(String[] args) {
		ChatSetting a=new ChatSetting();
		a.sms();
		a.voicmsg();
		int q=10;
		System.out.println("check the a is "+q);
	}
	
}
