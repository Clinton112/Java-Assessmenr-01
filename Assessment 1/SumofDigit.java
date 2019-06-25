package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,inp=0;
        boolean stop=false;
        System.out.println("Enter integers (-1) to terminate : ");
        do {
            try {
                inp=sc.nextInt();
                if(inp!=-1)
                sum+=inp;
            }
            catch (InputMismatchException e)
            {
                stop=true;
                System.out.println("Invalid Input !!");
                break;
            }
        }while (inp!=-1);
        if(!stop)
            System.out.println(sum);
    }

}