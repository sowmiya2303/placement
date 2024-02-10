/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program5;

/**
 *
 * @author Aji
 */
public class Program5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    public static String justifyText(String text, int length) {
        String[] words = text.split("_"); // Split the input text into words
        
        int totalSpaces = length - text.length(); // Calculate the total spaces needed
        int spaceCount = words.length - 1; // Count the number of spaces needed between words
        int spacePerWord = totalSpaces / spaceCount; // Calculate the spaces to distribute evenly
        
        StringBuilder justifiedText = new StringBuilder(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            // Append spaces to each word except the last one
            for (int j = 0; j < spacePerWord; j++) {
                justifiedText.append('_');
            }
            justifiedText.append(words[i]);
        }
   
