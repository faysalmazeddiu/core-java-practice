/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author faysalmazed
 */
public class Array2 {
    public static void main(String[] args) {
        /*
        int[] numberArray={100,-3,11,1,200,6,78};
        Arrays.sort(numberArray);
        
        for(int i=0;i<numberArray.length;i++){
        
            System.out.println(numberArray[i]);
        }
        
        for(int i=numberArray.length-1;i>=0;i--){
            System.out.println(numberArray[i]);
        }

        */
        
        ArrayList<String> nameArrayList=new ArrayList<String>();
        
        ArrayList<String> nameArrayList2=new ArrayList<String>();
        
        nameArrayList.add("Mazed");
        nameArrayList.add("abir");
        nameArrayList.add("cjib");
        nameArrayList.add("Zaria");
        nameArrayList.add("tro");
        
        System.out.println(nameArrayList.size());
        
        Collections.sort(nameArrayList);
        System.out.println("after sort"+nameArrayList);
        Collections.sort(nameArrayList,Collections.reverseOrder() );
        System.out.println("reverse"+nameArrayList);
        
//        for(String name: nameArrayList){
//            System.out.println(name);
//        }
        
//          Iterator name=nameArrayList.iterator();
//          while(name.hasNext())
//          {
//              System.out.println(name.next());
//          }        //nameArrayList.contains("Mazed")



            nameArrayList.remove(3);
            for(String name: nameArrayList){
            System.out.println(name);
            }
            //nameArrayList.removeAll(nameArrayList);
            boolean value=nameArrayList.contains("Sazed");
            System.out.println(value);
            
            //nameArrayList.clear();
            System.out.println(nameArrayList);
             System.out.println(nameArrayList.indexOf("Sazed"));
            
             nameArrayList.set(3, "Nayem");
             
             System.out.println(nameArrayList.get(1));
             
             
            nameArrayList2.addAll(nameArrayList);
            System.out.println(nameArrayList2);
            System.out.println(nameArrayList2.equals(nameArrayList));
            
    }
}
