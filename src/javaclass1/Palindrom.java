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
public class Palindrom {
    
    public static void main(String[] args){
        
        int number=232;
        int sum=0;
        int temporary=number;
        
        while(temporary!=0){
            int reminder=temporary%10;
            //sum=sum+reminder; // sum of each degit
            sum=sum*10+reminder; // reverse
            temporary=temporary/10;
        }
        
        //System.out.println(sum);
        
        if(number==sum){
            System.out.println("Number is palendom");
        }
        
        //System.out.println(Arrays.toString(selectionSort(arrayEliment)));
    }
    
}
