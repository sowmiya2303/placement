/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


   
public class Permutations {
    public static Set<String> permutations(String str) {
        Set<String> result = new HashSet<>();
        if (str.length() <= 1) {
            result.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String firstChar = String.valueOf(str.charAt(i));
                String remainingChars = str.substring(0, i) + str.substring(i + 1);
                for (String subPermutation : permutations(remainingChars)) {
                    result.add(firstChar + subPermutation);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        Set<String> perms = permutations(input);
        System.out.println("Permutations of '" + input + "':");
        for (String perm : perms) {
            System.out.println(perm);
        }
    }
}
