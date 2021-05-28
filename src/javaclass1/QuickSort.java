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
public class QuickSort {
    
    public static void main(String[] args){
        
        //int[] arrayEliment={10,3,8,4,7,15};
        int[] arrayEliment={14,3,1,9,17,8,15};
        int low=0;
        int high=arrayEliment.length-1;
        quickSort(arrayEliment,low,high);
        
        //System.out.println(quickSort(arrayEliment,low,high));
       System.out.println(Arrays.toString(arrayEliment));
    
    }
    
    public static void quickSort(int[] arrayEliment, int low, int high ){
        if(low<high){
            int partitionIndex=partition(arrayEliment,low,high);
            System.out.println(partitionIndex);
        quickSort(arrayEliment,low,partitionIndex-1);
            quickSort(arrayEliment,partitionIndex+1,high);
            
        }
        
    }
    
    public static int partition(int[] arrayEliment, int low, int high){
        //int[] arrayEliment={14,3,1,9,17,8,15};
        //[6,3,8,4,7,5]
        int pivot=arrayEliment[high];
        //int high=arrayEliment.length-1;
        int extra=low-1;
        for(int i=low;i<high;i++){
            
            if(arrayEliment[i]<pivot){
                ++extra;
                int swap;
                swap=arrayEliment[extra]; 
                arrayEliment[extra]=arrayEliment[i];
                arrayEliment[i]=swap;
                
            }
            
        }
        
        int swap=arrayEliment[extra+1];
        arrayEliment[extra+1]=arrayEliment[high];
        arrayEliment[high]=swap;
        return extra+1;
    
    }
    
}
