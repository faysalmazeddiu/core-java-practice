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
public class MathClass {
    
    public static void main(String[] args){
            int number1=23;
            int number2=90;
            int number3=-2;
            System.out.println(Math.max(number1, number2));
            System.out.println(Math.min(number1, number2));
            System.out.println(Math.abs(number3));
            System.out.println(Math.pow(number3, 3));
            float number4=2.3f;
            
            System.out.println(Math.round(number4)); 
            System.out.println(Math.ceil(number4)); 
            System.out.println(Math.floor(number4)); 
            System.out.println(Math.round(Math.sqrt(5)));
            //System.out.println(Math.E);

    }
    
}
