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
public class InsertionSort {
    public static void main(String[] args){
        
        int[] arrayEliment={14,3,1,9,17,8,15};
        System.out.println(Arrays.toString(insertionSort(arrayEliment)));
        
    }
    
    public static int[] insertionSort(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int swap=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        
        return arr;
    
    }
}
