import java.util.*;
public class ReversewithoutLoops
{
    public static void main(String[] args) {
        String original,reverse="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to reverse :");
        original=input.next();
        int length=original.length();
        for (int loop=length-1;loop>=0;loop--)
        {
            reverse=reverse+original.charAt(loop);
        }
        System.out.println("Reverse of original String without String buffer is "+reverse);
    }
}
