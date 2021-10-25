package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //exercise 4.1
        for (int row = 1; row < 7; row++)
        {
            for (int column = 7 - row; column > 0; column--)
                System.out.print ("*");
            System.out.println ();
        }

        System.out.println ();

        //exercise 4.2
        for (int row = 1; row < 7; row++)
        {
            for (int stars = 1; stars <= row; stars++)
                System.out.print ("*");
            for (int dashes = 6 - row; dashes > 0; dashes--)
                System.out.print ("-");
            System.out.println ();
        }
    }
}
