package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        int rev=0;
        while(i>0){
            int d=i%10;
            rev=rev*10+d;
            i=i/10;
        }
        System.out.println(rev);
    }
}
