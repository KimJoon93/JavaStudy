package com.joon.inheritance;

public class IphoneXExample {
		public static void main(String[] args) {
			IphoneX iphone10 = new IphoneX("아이폰 10", "White" ,true);
			System.out.println("모델 : " + iphone10.model);
			iphone10.powerOn();
			iphone10.powerOff();
			iphone10.turnOffIphoneX();
		}
}
