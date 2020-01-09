package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        Scanner in = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        println("Enter 0 to enter a string to count \nEnter 1 to enter a file to count");

        String userChoice = in.nextLine();
        String userString = "";
        while (!userChoice.equals("0") && !userChoice.equals("1")){
            println("Enter 0 to enter a string to count \nEnter 1 to enter a file to count");

            userChoice = in.nextLine();
        }
        if (userChoice.equals("0")){
            print("Enter a string to count: ");
            userString = in.nextLine().toUpperCase();
        } else {
            print("Enter the file path: ");
            String fileLocation = in.nextLine();
            File file = new File(fileLocation);
            try{
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()){
                    userString = userString.concat(sc.nextLine().toUpperCase());
                }
            } catch (Exception e){
                println("Error: Could not find file in file path '" + fileLocation + "'");
            }

        }
        char[] charactersInString = userString.toCharArray();

        for (char character : charactersInString){
            if(alphabet.indexOf(character) > -1){
                if(charCount.containsKey(character)){
                    charCount.put(character, charCount.get(character) + 1);
                } else {
                    charCount.put(character, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> oneChar : charCount.entrySet()){
            println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }

    public static void println(String line) {
        System.out.println(line);
    }

    public static void print(String line) {
        System.out.print(line);
    }
}
