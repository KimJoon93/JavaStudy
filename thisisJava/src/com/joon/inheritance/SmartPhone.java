package com.joon.inheritance;

public class SmartPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("Turn On");
	}
	void powerOff() {
		System.out.println("Turn Off");
	}
	void bell() {
		System.out.println("Ring the Bell");
	}
	void sendVoice(String message) {
		System.out.println("본인 " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 " + message);
	}
	void hangUp() {
		System.out.println("Turn off the phone");
	}
	
}
