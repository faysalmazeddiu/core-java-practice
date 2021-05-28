/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.Scanner;

/**
 *
 * @author faysalmazed
 */
public class JavaClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //Scanner input=new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int number=input.nextInt();
//        System.out.print("Enter a string :");
//        String name=input.nextLine();
//        System.out.println(name);
        /*
          Scanner input=new Scanner(System.in);
          System.out.print("Enter first number");
          int first_number=input.nextInt();
          System.out.print("Enter Second number");
          int second_number=input.nextInt();
          
          int sum=first_number+second_number;
          System.out.println("The Addition of the two number "+sum);
          
          int subtract=first_number-second_number;
          System.out.println("The subtract of the two number "+subtract);
          
          int multiply=first_number*second_number;
          System.out.println("The multiply of the two number "+multiply);
          
          double divi=(first_number>second_number)?((double)first_number/second_number):((double)second_number/first_number);
          System.out.println("The division of the two number "+divi);
          
          int mod=(first_number>second_number)?(first_number%second_number):(second_number%first_number);
          System.out.println("The modulas of the two number "+mod);
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Select Any one Option......");
        System.out.println(" 1.Square \n 2.Rectengle \n 3.Triangle \n 4.Circle");
        int option = input.nextInt();
        int selection;
        if (option == 1) {

            System.out.println("Select Any one Option......");
            System.out.print(" 1.Square Area ========= 2.Square Peremeter =");

            selection = input.nextInt();

            if (selection == 1 || selection == 2) {

                System.out.print("Enter Square length = ");
                double length = input.nextDouble();
                SquareInfo(selection, length);

            } else {

                System.out.println("You selected wrong option");

            }

        } else if (option == 2) {

            System.out.println("Select Any one Option......");
            System.out.print(" 1.Rectengle Area ========= 2.Rectengle Peremeter =");
            selection = input.nextInt();

            if (selection == 1 || selection == 2) {
                System.out.print("Enter Rectengle length = ");
                double length = input.nextDouble();
                System.out.print("Enter Rectengle width = ");
                double width = input.nextDouble();
                RectengleInfo(selection, length, width);
            } else {
                System.out.println("You selected wrong option");
            }

        } else if (option == 3) {

            System.out.println("Select Any one Option......");
            System.out.print(" 1.Triangle Area ========= 2.Triangle Peremeter =");
            selection = input.nextInt();

            System.out.print("Enter Triangle base = ");
            double base = input.nextDouble();
            if (selection == 1) {

                System.out.print("Enter Triangle height = ");
                double height = input.nextDouble();
                TriangleInfo(selection, base, height);

            } else if (selection == 2) {

                System.out.print("Enter Triangle first side= ");
                double fs = input.nextDouble();
                System.out.print("Enter Triangle secnd side = ");
                double ss = input.nextDouble();
                TriangleInfo(selection, base, fs, ss);
            } else {
                System.out.println("You selected wrong option");
            }

        } else if (option == 4) {

            System.out.println("Select Any one Option......");
            System.out.print(" 1.Circle Area ========= 2.Circle Peremeter =");
            selection = input.nextInt();
            if (selection == 1 || selection == 2) {
                System.out.print("Enter Circle radius = ");
                double radius = input.nextDouble();
                CircleInfo(selection, radius);
            } else {
                System.out.println("You selected wrong option");
            }
        } else {
            System.out.println("You did not select any option");
        }

    }

    //Square info
    static void SquareInfo(int selection, double length) {

        if (selection == 1) {
            System.out.println("The Square area =" + Math.pow(length, length));
        } else {
            System.out.println("The Square Parimeter =" + (4 * length));
        }
    }

    static void RectengleInfo(int selection, double length, double width) {

        if (selection == 1) {
            System.out.println("The Rectengle Area = " + (length * width));
        } else {
            System.out.println("The Square Parimeter = " + (2 * (length + width)));
        }

    }

    static void TriangleInfo(int selection, double... properties) {

        if (selection == 1) {
            double area = 1;
            for (double info : properties) {
                area *= info;
            }
            double final_area = 0.5 * area;
            System.out.println("The Triangle Area = " + final_area);
        } else {

            double parimeter = 1;
            for (double info : properties) {
                parimeter *= info;
            }
            System.out.println("The Triangle Parimeter = " + parimeter);
        }

    }

    static void CircleInfo(int selection, double radius) {
        
        if (selection == 1) {
            System.out.println("The Circle Area = " + String.format("%.2f", (Math.PI * Math.pow(radius, 2))));
        } else {
            System.out.println("The Circle Parimeter = " + (2 * Math.PI * radius));
        }

    }

}
