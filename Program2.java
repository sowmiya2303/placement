/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Aji
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in); 
        String myString = sc.next(); 
        HashMap<Character,Integer> hashMap = new HashMap<>(); 
          
         for(int i=0;i<myString.length();i++){ 
             char c = myString.charAt(i); 
             if(!hashMap.containsKey(c)){ 
                 int counter = 0; 
                 for(int j=i;j<myString.length();j++){ 
                     if(c == myString.charAt(j)){ 
                         counter++; 
                     } 
                 } 
                 if(counter > 0){ 
                     hashMap.put(c,counter); 
                 } 
             } 
         } 
          
         for(char c:hashMap.keySet()){ 
             System.out.print(c); 
			 System.out.print(hashMap.get(c)); 
         } 
     } 
}
    
    
    


