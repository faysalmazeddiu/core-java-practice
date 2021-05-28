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
public class BinarySearch {
    
    public static void main(String[] args){
        
        int[] array={1,5,6,7,8,9,20,21,34,35,36,45,67,68,69,70};
        
        System.out.println(binarySearch(array,68));
    
     }
    
    public static int binarySearch(int[] array,int value){
        int length=array.length;
        int start=0;
        
        for(int i=0;i<length;i++){
            int midpoint=(start+length)/2;
            if(array[midpoint]==value){
                return value;
            }
            if(array[midpoint]>value){
                length=midpoint;
            }else{
                start=midpoint+1;
            }
        }
        
        return -1;
    
    }
    
}
