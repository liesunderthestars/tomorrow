package com;

public class TenthTreeFall {
	static double height = 100;
	static double distance = 100;
	public static void main(String[] args) {
	   for(int i=1; i<10; i++) {
	    distance = distance + height;
	    height = height / 2;
	   }
	  
	   System.out.println("·�̣�" + distance);
	   System.out.println("�߶ȣ�" + height / 2);
	}

}
