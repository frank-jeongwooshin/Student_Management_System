/*
Student Management System
- This project is for managing students simply
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean quitFlag = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to SMS !");

        while(quitFlag)
        {
            System.out.println("********** MENU **********");
            System.out.println("1. Register Student.");
            System.out.println("2. Check Student Information.");
            System.out.println("3. Edit Student Information.");
            System.out.println("4. Show All Students.");
            System.out.println("5. Quit the Program.");

            System.out.print("Please Select Number : ");
            int inputNum = input.nextInt();
            System.out.println("**************************");

            switch (inputNum)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    quitFlag = false;
                    input.close();
                    break;
            }
        }

    }
}