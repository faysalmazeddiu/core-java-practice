/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass1;
import java.util.Scanner;
/**
 *
 * @author BOSS
 */
public class timeConverter {
  
	public static void main(String[] args)
	{
		// create object of scanner class.
		Scanner in = new Scanner(System.in);
                converter(in.nextInt());
		// enter the seconds here.
		System.out.print("Enter seconds : ");

		
	}
        
        static void converter(int number){
            
           

            /*
		int p1 = number % 60;
		int p2 = number / 60;
		int p3 = p2 % 60;

		p2 = p2 / 60;
            
            
            60 second == 1 minutes;
            1   ''     1/60;
            120 ''     126/60;
            
            60  minutes   1 hour
            1    ''       1/60
            126/60 ''     (1/60)*(126/60);
            
*/
           int conversion=number%60;
            
            int hourCount=number/60;
            int miniuteCount=hourCount%60;
            hourCount=hourCount/60;
            
            
		System.out.print("HH:MM:SS - " +hourCount + ":" + miniuteCount + ":" + conversion);
                //System.out.print("HH:MM:SS - " +p2 + ":" + p3);
		System.out.print("\n");
            
            
        }
}

