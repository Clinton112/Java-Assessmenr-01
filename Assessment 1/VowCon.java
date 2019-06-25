package com.company;
import java.lang.Character;
import java.util.*;
import java.lang.*;
public class VowCon
{
    public static void main(String[] args)
    {
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text :");
        text = sc.nextLine();
        int len=text.length();
        for (int i=0;i<len;i++)
        {
            if(Character.isLetter(text.charAt(i)))
            {
                if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'
                            ||text.charAt(i)=='A'||text.charAt(i)=='E'||text.charAt(i)=='I'||text.charAt(i)=='O'||text.charAt(i)=='U')
                {
                    System.out.print("Vowel ");
                }
                else
                    {
                        System.out.print("Consonant ");
                    }
            }
            else
                {
                    System.out.println("Not a Letter..");
                    break;

                }

        }

    }
}
