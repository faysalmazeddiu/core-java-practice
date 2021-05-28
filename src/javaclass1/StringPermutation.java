/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;

import java.util.Arrays;

/**
 *
 * @author BOSS
 */
public class StringPermutation {
    
    public static void main(String[] args){
        char[] ch={'A','B','C'};
        permutation(ch,0,ch.length-1 );
    }
    
    static void permutation(char[] ch,int start, int end){
        if(start>=end){
            System.out.println("the final "+Arrays.toString(ch));
            return;
        }
        for(int i=start;i<ch.length;i++){
            swap(ch,i,start);
            System.out.println("After swap "+Arrays.toString(ch)+"the state of I "+i);
            permutation(ch,start+1,end);
            swap(ch,i,start);
            System.out.println("Back to orginal "+Arrays.toString(ch)+"the state of I "+i);
        }
    }

    private static void swap(char[] ch, int i, int start) {
        char c=ch[i];
        ch[i]=ch[start];
        ch[start]=c;//To change body of generated methods, choose Tools | Templates.
    }
    
}
