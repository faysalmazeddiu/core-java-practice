/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

/**
 *
 * @author faysalmazed
 */
public class EvenOdd {
     public static void main(String[] args){
         int number=151;
         checkEvenOdd(number);
         CheckNumberPalindrom(number);
     }
     
     public static void checkEvenOdd(int number){
         if(number%2==0){
             System.out.println("Number is even");
         }else{
             System.out.println("Number is Odd");
         }
     
     }
     
     public static void CheckNumberPalindrom(int number){
         
         int temporary=number;
         int sum=0;
         while(temporary !=0){
            int reminder=temporary%10;
            sum=sum*10+reminder;
            temporary=temporary/10;
            //System.out.print(sum);
         }
         
         if(sum==number){
             System.out.println("The number is Palindrom");
         }else{
             System.out.println("The number is not Palindrom");
         }
         
         
     }
}
