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
public class PrimeNumberChecking {
    
    public static void main(String[] args){
       
       checkNumber(10,20);
    }
    
    public static void checkNumber(int lowerLimit,int upperLimit)
    {
        int totalPrimeNumber=0;
        for(int i=lowerLimit;i<=upperLimit;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   count++; 
                   break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
                totalPrimeNumber++;
            }
        }
        System.out.print("\n");
        System.out.println("Total prime Number "+totalPrimeNumber);
        
    
    }
    
}
