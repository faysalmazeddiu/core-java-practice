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
public class BubbleSort {
    
    public static void main(String[] args){
        
        int[] arrayEliment={14,3,1,9,17,8,15};
        System.out.println(Arrays.toString(bubbleSort(arrayEliment)));
        
    }
    
    public static int[] bubbleSort(int[] arr){
        
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length-j-1;i++){
                int nextElement=i+1;
                //if(){
                if(arr[i]>arr[nextElement]){
                    int swap=arr[nextElement];
                    arr[nextElement]=arr[i];
                    arr[i]=swap;
                }
                //}
            }
            
        }
        
        return arr;
    
    }
    
}
