/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author faysalmazed
 */
public class MapPractice {
    
    public static void main(String[] args){
        HashMap<Integer,String> familyMember=new HashMap<Integer,String>();
        
        familyMember.put(102, "Mazed Hossain");
        familyMember.put(103, "Sazed Hossain");
        familyMember.put(104, "Alamin Hossain");
        familyMember.put(107, "Nayem Hossain");
        familyMember.put(105, "Sajib Hossain");
        familyMember.put(106, "Nayem Hossain");
       // int count=0;
        for(String memberName:familyMember.values()){
            //System.out.println("key ="+member.getKey()+" name ="+member.getValue());
            System.out.println(memberName);
        
        }
        
        System.out.println();
        System.out.println();
        
        Iterator key=familyMember.keySet().iterator();
        while(key.hasNext()){
            System.out.println(key.next());
        
        }
        
       
        
        System.out.println();
        System.out.println();
        
        System.out.println(familyMember.get(104));
        
        System.out.println(familyMember.containsKey(106));
        System.out.println(familyMember.containsValue("Sajib Hossain"));
        
        System.out.println(familyMember.size());
        
        familyMember.remove(102);
        familyMember.replace(103, "Sirajul Hossain");
        
        System.out.println();
        System.out.println();
        for(Entry<Integer,String> keyAndValue:familyMember.entrySet()){
            
            System.out.println("key ="+keyAndValue.getKey()+" name ="+keyAndValue.getValue());
        
        }
    
    }
    
}
