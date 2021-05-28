/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author faysalmazed
 */
public class StringPractice {
    
    public static void main(String[] args){
        String sentence="Apple apple Orange apple mango mango banana mango mango orange orange";
        sameWordCount(sentence);
        System.out.println(wordFrequencyCount(sentence));
        
        /*
        String first_name="mazed";
        String last_name="hossain";
        System.out.println(first_name.charAt(2));
        System.out.println(first_name.concat(" "+last_name));
        System.out.println(first_name.indexOf("z"));
        
        System.out.println(first_name.startsWith("m"));
        
         System.out.println(first_name.endsWith("d"));
         System.out.println(sentence.contains("Bangladesh"));
        
        */
           /*
        String[] wordArray=sentence.split(" ");
        System.out.println(wordArray);
        
      
        System.out.println(Arrays.toString(wordArray));
        for(String words:wordArray){
            if(words.equals("leading")){
                char[] charecter=words.toCharArray();
                
                //System.out.println(charecter);
                System.out.println(" got the word. the length of the word="+words.length());
            
            }
        }
*/
    
    }
    
    
    public static void sameWordCount(String sentence){
        String[] wordArray=sentence.toLowerCase().split(" ");
        HashMap<String, Integer> wordMap=new HashMap<String, Integer>();
        int count=0;
        for(String words: wordArray){
            if(wordMap.containsKey(words)){
                 count=wordMap.get(words);
                wordMap.put(words,count+1);
                
            }else{
                count=1;
                wordMap.put(words, count);
            }
        }
        
        
        for(Entry<String, Integer> wordPrint:wordMap.entrySet()){
            
            System.out.println(wordPrint.getKey()+" ="+wordPrint.getValue());
            
        
        }
        
        
        
    
    
    }
    
      public static String wordFrequencyCount(String sentence){
          String[] wordArray=sentence.toLowerCase().split(" ");
          int[] valueArray;
          HashMap<String, Integer> wordMap=new HashMap<String, Integer>();
        int count=0;
        for(String words: wordArray){
            if(wordMap.containsKey(words)){
                 count=wordMap.get(words);
                wordMap.put(words,count+1);
                
            }else{
                count=1;
                wordMap.put(words, count);
            }
        }
        
        String ferequencyWord="";
        int max=Collections.max(wordMap.values());
        for(Entry<String, Integer> wordPrint:wordMap.entrySet()){
            if(max==wordPrint.getValue()){
                 ferequencyWord=wordPrint.getKey();
            }
        }
        
           return  ferequencyWord;
        }
    
}
