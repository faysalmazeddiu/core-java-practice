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
public class Factorial {
    
    public static void main(String[] args){
        
        int fact=1;
        
//        for(int i=5;i>0;i--){
//            fact=fact*i;
//        
//        }
//        System.out.println(fact);

            System.out.println(factorial(5));
    
    }
    
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    
}
