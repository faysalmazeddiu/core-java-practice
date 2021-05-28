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

//0 1 1 2 3 5 8 13 21
public class Fibonacci2 {
    
    public static void main(String[] args){
        
        int firstNumber=0;
        int secondNumber=1;
        System.out.print(firstNumber+" "+secondNumber);
        int result=0;
        
        for(int i=1;i<=10;i++){
            
             result=firstNumber+secondNumber;
             firstNumber=secondNumber;
             secondNumber=result;
             
             System.out.print(" "+result);
             //firstNumber=
        }
    
    }
    
}
