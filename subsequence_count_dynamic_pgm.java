package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String s=sc.next();
            int a_count=0,b_count=0,c_count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a')
                    a_count=1+2*a_count;
                if(s.charAt(i)=='b')
                    b_count=a_count+2*b_count;
                if(s.charAt(i)=='c')
                    c_count=b_count+2*c_count;
            }
            System.out.println(c_count);
           t--;
        }
    }
}
