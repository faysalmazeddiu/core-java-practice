/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;
import javaclass1.Student;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * @author faysalmazed
 */
public class MapPrctice2 {
    
    
    public static void main(String[] args){
        
    HashMap<Integer,Student> studentMap=new HashMap<Integer,Student>();
    
    Student studentInfo=new Student("Mazed","SWE","Web programming");
    Student studentInfo2=new Student("Sazed","CSE","Android");
    Student studentInfo3=new Student("Mahir","IT","Machine Learning");
    Student studentInfo4=new Student("Nayem","CSIT","Big Data Technology");
    
    
    studentMap.put(101, studentInfo);
     studentMap.put(102, studentInfo2);
    studentMap.put(103, studentInfo3);
    studentMap.put(104, studentInfo4);
    
    System.out.println();
    System.out.println();
    for(int id:studentMap.keySet()){
        
        System.out.println("Student id="+id);
    }
    
    System.out.println();
    System.out.println();
        for(Student info:studentMap.values()){
                
            System.out.println("Student name ="+info.name+" Dept ="+info.dept+" course ="+info.course);
        }
    
    System.out.println();
    System.out.println();
        for(Entry<Integer,Student> info:studentMap.entrySet()){
            
            if(info.getKey()==104){
                studentMap.remove(info.getKey());
                studentMap.put(105, new Student("Jihad","CSIT","IOT"));
            }
            
             System.out.println("Student id= "+info.getKey()+" Student name="+info.getValue().name+" Dept ="+info.getValue().dept+" course ="+info.getValue().course);
    
        }
        
        System.out.println(studentMap.size());
    
    
    }
    

    
    
}
