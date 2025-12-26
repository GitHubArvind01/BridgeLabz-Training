package com.classandobject.Level1;

public class MobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMobilePhone mobile1=new DisplayMobilePhone("VIVO","VIVO V29" , 15999);
		DisplayMobilePhone mobile2=new DisplayMobilePhone("ONE PLUS","ONE PLUS nord4",39999);
		DisplayMobilePhone mobile3=new DisplayMobilePhone("APPLE","iphone pro16",79999);
		
		//calling the method
		mobile1.displayMobile();
		mobile2.displayMobile();
		mobile3.displayMobile();
	}

}
