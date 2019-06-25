package com.company;
import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        pattern(num);
    }
    public static void pattern(int num)
    {
        for (int loop01=1;loop01<=num;loop01++)
        {
            for(int loop02=1;loop02<=loop01;loop02++)
            {
                System.out.print(loop01+"");
            }
        }
    }


}
