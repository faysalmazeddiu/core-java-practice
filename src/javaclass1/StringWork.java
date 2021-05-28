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
public class StringWork {
    
    public static void main(String[] args){
        String name="    Md.Faysal Hosain Mazed    ";
        String name2="Md.Fay_salHosain_mazed";
        
        String name3=" Engineering@#$%^&*";
        System.out.println(name.length());
        
        
        
        System.out.println(name.contains("Hosain"));
        
        //checking equality with case
        System.out.println("Checking equality with case= "+name.equals(name2));
        
        //ignor case
        System.out.println("Checking equality without case= "+name.equalsIgnoreCase(name2));
        
        System.out.println("chcking empty= "+name.isEmpty());
        
        System.out.println("Concate= "+name3.concat(name));
        
        System.out.println("upper case= "+name.toUpperCase());
        
         System.out.println("lower case= "+name.toLowerCase());
         
         System.out.println("start with = "+name.startsWith("M"));
         
         System.out.println("end  with  = "+name.endsWith("M"));
         
         System.out.println("Space remove from first side and last side of string  = "+name.trim());
         
         System.out.println(" find index for specific charecter from a string   = "+name2.indexOf("al"));
         
         System.out.println(" find index for lat specific charecter from a string   = "+name2.lastIndexOf("a"));
         
         System.out.println(" remove special charecter   = "+name3.replaceAll("([@#$%^&*])",""));
         
         // string devide
         String[] split=name2.split("_");
         
         for(String d:split){
             System.out.println(d);
         }
         
         Array info=new Array(){
             void Displayinfo(){
                 System.out.println("Hello everybody");
             }
         };
         info.Displayinfo();
         
         
         // forEach use
         
         int[] intArray={23,45,6,7,8,10};
         //intArray.forEach()
         
        
    }
    
}
