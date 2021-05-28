/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.Arrays;

/**
 *
 * @author faysalmazed
 */
public class SelectionSort {
    
    public static void main(String[] args){
        
        int[] arrayEliment={14,3,1,9,17,8,15};
        System.out.println(Arrays.toString(selectionSort(arrayEliment)));
    }
    
    public static int[] selectionSort(int[] arr){
        //int min;
        //int[] arry;
            
        for(int j=0;j<arr.length;j++){
            int minIndex=j;
            int min=arr[j];
            for(int i=j+1;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                    minIndex=i;
                }
                
            }
            if(minIndex!=j){
            int swap=arr[j];
            arr[j]=arr[minIndex];
            arr[minIndex]=swap;
            }
            
            
        }
        
        return arr;
    
    }
    
}
