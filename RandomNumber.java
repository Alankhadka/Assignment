package Javaassigment;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by CRANK on 2/10/2015.
 */
public class RandomNumber {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
     System.out.println("The random num generated are:");
        int number1=randomNumbergenerator();
        int number2=randomNumbergenerator();
        System.out.println("Number1="+number1);
        System.out.println("Number2="+number2);
        System.out.println("Enter the answer of the product between number 1 and 2");
        int answer=input.nextInt();
        int actualAnswer=number1*number2;
        if(answer==actualAnswer)
        {
            System.out.println("Congratulations");
        }
        else
            System.out.println("you need to study hard");


    }
    static int randomNumbergenerator()
    {
        int randomnumber=0;
        Random rand=new Random();
        randomnumber=rand.nextInt(9);
        return randomnumber;
    }
}
