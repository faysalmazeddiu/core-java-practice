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
public class Array {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        twoDArray(input);

    }

    static void twoDArray(Scanner input) {
        System.out.println("Please Enter Value for first matrix...");
        //int number = 10;
        int[][] twoDArray1 = new int[3][3];
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.printf("A[%d][%d]  ",row,col);
                twoDArray1[row][col] = input.nextInt();
                //number += 10;
                //System.out.print(twoDArray1[row][col] + "\t");
            }
            //System.out.println();

        }
        
        /*
        //System.out.println("\n\n");
        System.out.println("Please Enter Value for second matrix...");
        int[][] twoDArray2 = new int[3][3];
        for(int row=0;row<3;row++){
            
            for(int col=0;col<3;col++){
                System.out.printf("B[%d][%d]  ",row,col);
                twoDArray2[row][col]=input.nextInt();
                //System.out.print(twoDArray2[row][col] + "\t");
            }
            //System.out.println();  
        }
        //System.out.println("\n\n");
        */
        
        
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print(twoDArray1[row][col] + "\t");
            }
            System.out.println();

        }
        
        
        /*
        System.out.println("\n\n");
        
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print(twoDArray2[row][col] + "\t");
            }
            System.out.println();

        }
        
        
        System.out.println("Addition of two matrix");
        
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print((twoDArray1[row][col]+twoDArray2[row][col]) +"\t");
               
            }
            System.out.println();

        }
        */
        
        
        System.out.print("");
        int diagonalElement=0,upperTraingleElement=0,lowerTraingleElement=0;
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                if(row==col){
                   diagonalElement+=twoDArray1[row][col];
                }else if(row<col){
                    upperTraingleElement+=twoDArray1[row][col];
                }else if(row>col){
                    lowerTraingleElement+=twoDArray1[row][col];
                }
                //System.out.print((twoDArray1[row][col]+twoDArray2[row][col]) +"\t");
               
            }
            

        }
        
        System.out.println("The sum of diagonalElement "+diagonalElement);
        System.out.println("The sum of upperTraingleElement "+upperTraingleElement);
        System.out.println("The sum of lowerTraingleElement "+lowerTraingleElement);
    }
    
    void Displayinfo(){
        System.out.println("Md Faysal Hosain Mazed");
    }

}
