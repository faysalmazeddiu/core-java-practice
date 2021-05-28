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
public class ArmstrongNumber {
    
    public static void main(String[] args){
        int number=153;
        int sum=0;
        int temp=153;
        while(temp!=0){
        int reminder=temp%10;
        //sum=sum+Math.pow(reminder, 3);
        sum=sum+reminder*reminder*reminder;
        temp=temp/10;
        }
        System.out.println(sum);
        if(sum==number){
            
            System.out.println("The number is armostrong");
        
        }
    
    }
    
}
