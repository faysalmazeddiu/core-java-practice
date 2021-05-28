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
public class Series {
    
    public static void main(String[] args){
        int number=10;
        //System.out.println(doubleSeriesSum(number));
        //doubleSeriesSum(number);
        //doubleSeriesSum(number);
        //oneByoneSeriesSum(number);
        squareSeriesSum(number,2);
    }
    
    
    
   // 1+3+5+........+n
    public static void oneByoneSeriesSum(int number){
        //double seriesNumber=0.5;
        int sum=0;
        for(int i=1;i<=number;i=i+2){
            sum=sum+i;
            if(i==number-1){
                System.out.print(i+"=");
            }else{
                System.out.print(i+" + ");
            }
            
            
        }
        System.out.println(sum);
        
        //System.out.println(sum);
       // return sum;
    }
    
    
    
    //1.5+2.5+3.5+..........+n
    public static void doubleSeriesSum(int number){
        double seriesNumber=0.5;
        double sum=0;
        for(int i=1;i<=number;i++){
            seriesNumber=seriesNumber+1;
            sum=sum+seriesNumber;
            if(i==number){
                System.out.print(seriesNumber+"=");
            }else{
                System.out.print(seriesNumber+" + ");
            }
            
        }
        
        System.out.println(sum);
       // return sum;
    }
    
    
    //1^2+2^2+3^2+........+n^2
    public static void squareSeriesSum(int number,int power){
        
        double result=0;
        for(int i=1;i<=10;i++){
            
             result=result+Math.pow(i, power);
            
            //System.out.println();
            if(i==number){
                System.out.print(i+"^"+power+"=");
            }else{
                System.out.print(i+"^"+power+"+");
            }
        }
        System.out.println(result);
       
    }
    
}
