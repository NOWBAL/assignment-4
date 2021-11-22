package assignment_4;
import java.util.Scanner;

public class Lcm3Numbers {
    public static void main(String [] args)
    {
        Scanner stdin = new Scanner(System.in);
        int[] evenNum = new int [100];
        int[] oddNum = new int[100];
        int evenIndex=0;
        int input=0;
        int i=0;
        int k=0;
        int j=0;
        String name;

        System.out.println("Type In Your Name");
        name = stdin.nextLine();


        while ((i < oddNum.length && i < evenNum.length) && input !=-1)
        {
            try{

                System.out.println(name+" Enter a positive number, Enter -1 For results");
                input= stdin.nextInt();

                oddNum[i]=input;
                i++;
            }

            catch(Exception d){
                System.out.println("Only Positive Numbers & no Letters Please!");
                stdin.next();

            }


        }

}}
