package com.joon.inheritance;

public class IphoneX extends SmartPhone{

		boolean pro;
		
		IphoneX(String model, String color, boolean pro){
			this.model = model;
			this.color = color;
			this.pro = pro;
		}
		
		void turnOnIphoneX() {
			System.out.println("");
		}
		
		void turnOffIphoneX() {
			System.out.println("아이폰 ");
		}

}
