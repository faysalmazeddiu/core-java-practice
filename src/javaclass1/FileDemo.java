/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author faysalmazed
 */
public class FileDemo {
    public static void main(String[] args) {
        File dir=new File("Folder1");
        dir.mkdir();
        //get path of the created folder
        String path=dir.getAbsolutePath();
        System.out.println(path);
        
        // get created folder name
        System.out.println(dir.getName());
        
        //delete folder
        //dir.delete();
        
        File text1= new File("/Users/faysalmazed/NetBeansProjects/JavaClass1/Folder1/text1.txt");
        File text2= new File("/Users/faysalmazed/NetBeansProjects/JavaClass1/Folder1/text2.txt");
        
        try{
            text1.createNewFile();
            text2.createNewFile();
            System.out.println("File Created");
            
        }catch(Exception e){
             System.out.println(e);
        }
        
        // file delete from folde"
        //text1.delete();
        
        if(text1.exists()){   // checking file existence
           System.out.println("Exist");
        }else{
            System.out.println("Not Exists");
        }
        
        
        // writting data into file
        try{
            Formatter formate=new Formatter("/Users/faysalmazed/NetBeansProjects/JavaClass1/Folder1/text1.txt");
            formate.format("%s %s\n","101","Mazed");
            formate.format("%s %s\n","102","sazed");
            formate.format("%s %s\n","103","Sajib");
            formate.close();
        }catch(Exception e){
            System.out.println(e);
        
        }
        
        
        
        
        // reading data from file
        
        //File text1= new File("/Users/faysalmazed/NetBeansProjects/JavaClass1/Folder1/text1.txt");
        try{
            Scanner scanner=new Scanner(text1);
            while(scanner.hasNext()){
                //String Id=scanner.nextLine();  // read full line
                
                String Id=scanner.next();
                String Name=scanner.next();
                System.out.printf("Id= %s name= %d ",Id,Name);
            }
            
            scanner.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
}
