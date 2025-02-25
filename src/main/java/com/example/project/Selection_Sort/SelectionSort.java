package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) { 
        int minimumIndex = 0;  
        int temp;  
        for (int i = 0; i < elements.length; i++) {
            minimumIndex = i; 
            for (int x = i + 1; x < elements.length; x++) {
                if (elements[x] < elements[minimumIndex]) {
                    minimumIndex = x;
                }
            }
            temp = elements[i]; 
            elements[i] = elements[minimumIndex]; 
            elements[minimumIndex] = temp;
       }
       return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {  
        for (int i = 0; i < words.size(); i++) {
            int minimumIndex = i; 
            for (int x = i + 1; x < words.size(); x++) {
                if (words.get(x).compareTo(words.get(minimumIndex)) < 0) {
                    minimumIndex = x;
                }
            }
            String temp = words.set(i, words.get(minimumIndex)); 
            words.set(minimumIndex, temp); 
       }
       return words;
    }

    

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
