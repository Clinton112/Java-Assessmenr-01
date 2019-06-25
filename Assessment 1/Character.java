package com.company;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Character
{
    public static void main(String[] args)throws IOException {
        char variable;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any alphabet:");
        variable = (char) bf.read();
        if(variable >= 97 && variable <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(variable >= 65 && variable <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(variable >= 48 && variable <= 57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}
