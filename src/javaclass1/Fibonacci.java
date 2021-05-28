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
public class Fibonacci {
    
    public static void main(String[] args){
        int firstNumber=0;
        int secondNumber=1;
        int nextResult=0;
        System.out.print(firstNumber+" "+secondNumber);
        for(int i=1;i<21;i++){
            nextResult=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextResult;
            System.out.print(" "+nextResult);
        
        }
    
    }
    
}
