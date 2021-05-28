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
public class LinearSearch {
    
    public static void main(String[] args){
        
        int[] array={1,3,0,20,34,80};
        
        System.out.println(linearSearch(array,20));
    
    }
    
    public static int linearSearch(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==value){
                return value;
            }
        
        }
        
        return -1;
    }
    
}
