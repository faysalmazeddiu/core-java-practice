/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author faysalmazed
 */
public class ListTutorial {
    
    public static void main(String[] args){
    
        LinkedList<Integer> numberList=new LinkedList<>();
        numberList.add(200);
        numberList.add(50);
        numberList.add(1);
        numberList.add(100);
        numberList.add(9);
        //System.out.println(numberList);
        //Collections.sort(numberList);
        //System.out.println(numberList);
        //Collections.sort(numberList,Collections.reverseOrder());
        //System.out.println(numberList);
        
        
        //numberList.set(1, 6);
        
        numberList.addFirst(70);
        numberList.addFirst(80);
        numberList.add(2,300);
        numberList.addLast(600);
        
        
        System.out.println(numberList);
        
        System.out.println(numberList.getFirst());
        
        System.out.println(numberList.getLast());
        System.out.println(numberList.get(4));
        System.out.println(numberList.indexOf(50));
        System.out.println(numberList);
        
        for(int data:numberList){
            System.out.println(data);
        
        }
        
        System.out.println();
        System.out.println();
        
        for(int i=0;i<numberList.size();i++)
        {
            System.out.println(numberList.get(i));
        
        }
        
        
       // numberList.remove();
        //numberList.remove();
        numberList.removeFirst();
        numberList.removeLast();
        //System.out.println(numberList.peek());
        //System.out.println(numberList.peek());
        //numberList.remove(5);
        System.out.println();
        System.out.println();
        System.out.println(numberList);
       
       LinkedList<Integer> numberList2=new LinkedList<>();
       numberList2.add(1000);
       numberList2.add(2000);
       numberList2.add(3000);
       numberList2.add(4000);
       numberList.addAll(numberList2);
       System.out.println(numberList);
    }
    
}
