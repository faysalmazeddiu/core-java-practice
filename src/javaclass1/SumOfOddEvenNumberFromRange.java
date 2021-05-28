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
public class SumOfOddEvenNumberFromRange {
    
    public static void main(String[] args){
        int[] array={-105,-10,-11,-13,-209,-14,-16,-17};
        
        Arrays.sort(array);
        //System.out.print(Arrays.toString(array));
        
        //System.out.println(findMaxiMumElement(array));
        //System.out.println(findMiniMumElement(array));
        //System.out.println(Arrays.toString(sortArrayToDesc(array)));
        
        System.out.println(Arrays.toString(sortArrayToASC(array)));
        //System.out.println(sunOfEven(array));
        //System.out.println(sunOfOdd(array));
    }
    
    public static int sunOfEven(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        
        }
        
        return sum;
    
    } 
    
    public static int sunOfOdd(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        
        }
        
        return sum;
    }
    
    public static int findMaxiMumElement(int[] arr){
        
        int maxIndex=0;
            for(int i=1;i<arr.length;i++){
                if(arr[maxIndex]>arr[i]){
                    maxIndex=maxIndex;
                }else{
                    maxIndex=i;
                }
            }
        
        return arr[maxIndex];
    }
    
    public static int findMiniMumElement(int[] arr){
        int minIndex=0;
            for(int i=1;i<arr.length;i++){
                if(arr[minIndex]>arr[i]){
                    minIndex=i;
                }
            }
        
        return arr[minIndex];
    }
    
    
    public static int[] sortArrayToDesc(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int maxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxIndex]>arr[j]){
                    maxIndex=maxIndex;
                }else{
                    maxIndex=j;
                }
            }
            //if(maxIndex!=){
                int temp=arr[i];
                arr[i]=arr[maxIndex];
                arr[maxIndex]=temp;
            //}
            
        }
    
        return arr;
    }
    
    
    public static int[] sortArrayToASC(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int maxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxIndex]>arr[j]){
                    maxIndex=j;
                }
            }
            //if(maxIndex!=){
                int temp=arr[i];
                arr[i]=arr[maxIndex];
                arr[maxIndex]=temp;
            //}
            
        }
    
        return arr;
    }
    
    
}
