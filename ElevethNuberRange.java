package com;

public class ElevethNuberRange {
	public static void main(String[] args) {
		   int count = 0;
		   for(int x=1; x<5; x++) {
		    for(int y=1; y<5; y++) {
		     for(int z=1; z<5; z++) {
		      if(x != y && y != z && x != z) {
		       count ++;
		       System.out.print(x*100 + y*10 + z + "   ");
		       if(count % 4 == 0) {
		        System.out.println();
		       }
		      }
		     }
		    }
		   }
		   System.out.println("共有" + count + "个三位数");
		}

}
