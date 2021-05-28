/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.LinkedList;

/**
 *
 * @author faysalmazed
 */
public class PracticalLinkList {
    
    public static void main(String[] args){
        LinkedList<String> nameList=new LinkedList<String>();
        nameList.add("Mazed");
        nameList.add("sazed");
        nameList.add("sajib");
        
        System.out.println(nameList.size());
        
        for(String names:nameList){
            
            System.out.println(names);
        
        }
        nameList.add(1, "Mahir");
        System.out.println("\n\n");
        for(String names:nameList){
            
            System.out.println(names);
        
        }
        
        nameList.addFirst("Nayem");
        nameList.addLast("Zaria");
        System.out.println("\n\n");
        for(String names:nameList){
            
            System.out.println(names);
        
        }
        
       // nameList.remove(0);
       // nameList.remove("sajib");
       
       //nameList.removeFirst();
       //nameList.removeLast();
       
       
       System.out.println(nameList.getFirst());
       
       System.out.println(nameList.getLast());
    }
    
}
