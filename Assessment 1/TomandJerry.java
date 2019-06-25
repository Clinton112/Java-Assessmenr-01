package com.company;
import java.util.*;
public class TomandJerry
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check :");
        number=sc.nextInt();
        if(number>=20 && number <=30)
        {
            if(number %2==0)
            {
                System.out.println("JERRY");
            }
            else
            {
                System.out.println("TOM");
            }

        }
        else
        {
            System.out.println("Wrong input");
        }
    }
}
