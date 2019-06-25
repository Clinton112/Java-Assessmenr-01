package com.company;
import java.util.*;
public class Secretnumber
{
    public static void main(String[] args)
    {

        int secretNumber;
        secretNumber=(int)(Math.random()*99+1);
        Scanner keyboard=new Scanner(System.in);
        int guess;
        do
            {
                System.out.print("Enter a guess ");
                guess=keyboard.nextInt();
                if (guess ==secretNumber)
                {
                    System.out.println("Your guess is correct congratulations !!");
                }
                else if (guess<secretNumber)
                {
                    System.out.println("Your guess is smaller than the secret number");
                }
                else if (guess>secretNumber)
                {
                    System.out.println("Your guess is greater than the secret number");
                }
            } while (guess!=secretNumber);
    }
}
