package com;

public class Plane {
	public static final int MONTH = 15;
	public static void main(String[] args) {
	   long f1 = 1L, f2 = 1L;
	   long f;
	   for(int i=3; i<MONTH; i++) {
	    f = f2;
	    f2 = f1 + f2;
	    f1 = f;
	    System.out.print("��" + i +"���µ����Ӷ���: ");
	    System.out.println(" " + f2);
	   }
	}

}
