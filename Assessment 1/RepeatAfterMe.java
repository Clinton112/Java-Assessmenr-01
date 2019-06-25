import java.util.*;
public class RepeatAfterMe
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input1 = input.next();
        System.out.println("Enter an number :");
        int input2 = input.nextInt();
        repeat(input1, input2);
    }
    public static void repeat(String input1,int input2)
    {
        for (int loop=0;loop<input2;loop++)
        {
            System.out.print(input1);
        }

    }
}
