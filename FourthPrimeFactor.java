package com;

import java.util.Scanner;
public class FourthPrimeFactor {
static int n, k = 2;
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   n = s.nextInt();
   System.out.print(n + "=" );
   FourthPrimeFactor fpf = new FourthPrimeFactor();
   fpf.f(n);
}
public void f(int n) {
   while(k <= n) {
    if(k == n) {
     System.out.println(n);
     break;
    } else if(n > k && n % k == 0) {
     System.out.print(k + "*");
     n = n / k; 
     f(n);
     break;
    } else if(n > k && n % k != 0) {
     k++;
     f(n);
     break;
    }
   }
}
 
}