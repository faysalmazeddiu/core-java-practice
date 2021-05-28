/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

/**
 *
 * @author BOSS
 */
public class StringITPractice {
    
    public static void main(String[] args){
            System.out.println(getUserName ("john","smith"));
            System.out.println(getUserName ("mark","0'Reilly"));
            System.out.println(getUserName ("john",null));
            
    }
    
     public static String getUserName (String firstName, String lastName) {
        // return the user name as LastName, FirstName e.g. Smith, John

        StringBuffer sBuffer=new StringBuffer();
        if(lastName==null || lastName.equals("")){
            firstName=capitaliseFirstLetter(firstName);
            return firstName;
        }
        else if(!firstName.equals("")  && !lastName.equals("")){
            firstName=capitaliseFirstLetter(firstName);
            lastName=capitaliseFirstLetter(lastName);
            sBuffer.append(lastName);
            sBuffer.append(",");
            sBuffer.append(firstName);
            
        }
        return String.valueOf(sBuffer);
    }
    
    
    public static String capitaliseFirstLetter (String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
            
        char[] chars = s.toCharArray();
        
        chars[0] = Character.toUpperCase(chars[0]);
        
        return String.valueOf(chars);
    } 
    
}
