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
public class QuickSort2 {
    
    public static void main(String[] args){
        
        //int[] arrayEliment={10,3,8,4,7,15};
        int[] arrayEliment={14,3,1,9,17,8,15};
        int low=0;
        int high=arrayEliment.length-1;
        quickSort(arrayEliment,low,high);
        
        //System.out.println(quickSort(arrayEliment,low,high));
       System.out.println(Arrays.toString(arrayEliment));
    
    }
    
    
    public static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);
 
        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
    }
    
    private static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);
 
    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;
 
            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }
 
    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;
 
    return i+1;
}
    
    
    
}
