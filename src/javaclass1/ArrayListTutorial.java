/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author faysalmazed
 */
public class ArrayListTutorial {
    
    public static void main(String args[]){
        /*
            // arraylist store value based on index position
        
        */
        ArrayList<String> nameList=new ArrayList<String>(); 
        
        nameList.add("Sazed");
        nameList.add("Mazed");
        nameList.add("Sajib");
        nameList.add("Shihab");
        nameList.add("Joshim");
        nameList.add(3, "Mahir");
        
        
        System.out.println(nameList.size());
        
        for(String name:nameList){
            System.out.println(name);
        }
        
        System.out.println();
        System.out.println();
        Iterator name=nameList.iterator();
        while(name.hasNext()){
           System.out.println(name.next()); 
        
        }
        
        boolean decision=nameList.isEmpty();
        System.out.println(decision);
        
        System.out.println(nameList.indexOf("Shihab"));
        System.out.println(nameList.contains("Mazed"));
        
        
        nameList.remove(3);
        nameList.remove("Shihab");
        
        
        System.out.println(nameList.get(3));
        
        ArrayList<Integer> numberList=new ArrayList<Integer>(); 
        numberList.add(200);
        numberList.add(4500);
        numberList.add(14);
        numberList.add(15);
        numberList.add(9);
        numberList.add(30);
        numberList.add(45);
        
       //System.out.println(Arrays.sort(nameList.toArray().toString()));
       Collections.sort(numberList);
       System.out.println(numberList);
       
       Collections.sort(numberList,Collections.reverseOrder());
        
        System.out.println(numberList);
        
        System.out.println();
        System.out.println();
        
        ArrayList<String> nameList2=new ArrayList<String>();
        nameList2.add("mahabub");
        nameList2.add("Shiblu");
        nameList2.add("Milu");
        nameList.addAll(nameList2);
        System.out.println(nameList);
    
    }
    
}
