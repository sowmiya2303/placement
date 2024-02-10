/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.util.Scanner;

/**
 *
 * @author Aji
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
   Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        
        for(int j=0; j<str.length(); j++)
        {
            char a = str.charAt(j);
            int b = ((int)str.charAt(++j)-48);
           //  System.out.println(a);
            
            if(j+1 >= str.length())
            {
                for(int i=0; i<b; i++)
                System.out.print(a);
                break;
            }
            
            if (((int)str.charAt(j+1)-48)>-1 && ((int)str.charAt(j+1)-48)<10)
            {
                b = (b*10) + ((int)str.charAt(++j)-48);
            }
            //System.out.println(b);
            for(int i=0; i<b; i++)
                System.out.print(a);
        }
    } 
}