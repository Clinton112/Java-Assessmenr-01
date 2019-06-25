package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
	// write your code here
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check :");
        num=sc.nextInt();
       // long data = sc.nextLong();
        int temp=num;
        int sum = 0;
        int sum1=0;
        while(temp>0)
        {
            int rev = temp % 10;
            sum=sum*10+rev;
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum==num)
        {
            System.out.print(num + " is palindrome and ");
        }
        else
        {
            System.out.println(num+" is not palindrome");
        }
        int temp01=num;
        int rev01;
        while(temp01>0)
        {
            rev01 = temp01 % 10;
            if (rev01 % 2 == 0)
            {
                sum1 = sum1 + rev01;
                temp01 = temp01 / 10;
            }
        }
        if(sum1>25)
        {
            System.out.println("the sum of even numbers is greater than 25");
        }
        else
        {
            System.out.println("the sum of even numbers is less than 25");
        }

    }
}
