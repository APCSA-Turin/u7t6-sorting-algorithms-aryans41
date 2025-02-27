package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int currentValue = elements[i];
            int j = i;
            while (j > 0 && elements[j - 1] > currentValue) {
                count++;
                elements[j] = elements[j - 1];
                j--;
            }
            elements[j] = currentValue;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    public static void selectionSort(int[] elements) {
        int minimumIndex = 0;  
        int count = 0;
        int temp;  
        for (int i = 0; i < elements.length; i++) {
            minimumIndex = i;
            for (int x = i + 1; x < elements.length; x++) {
                count++;
                if (elements[x] < elements[minimumIndex]) {
                    minimumIndex = x;
                }
            }
            temp = elements[i];
            elements[i] = elements[minimumIndex];
            elements[minimumIndex] = temp;
       }
       System.out.println("SELECTION SORT: Number of loop iterations: " + count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            int j = i;
            while (j > 0 && words.get(j - 1).compareTo(currentWord) > 0) {
                count++;
                words.set(j, words.get(j - 1));
                j--;
            }
            words.set(j, currentWord);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }


    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            int minimumIndex = i;
            for (int x = i + 1; x < words.size(); x++) {
                count++;
                if (words.get(x).compareTo(words.get(minimumIndex)) < 0) {
                    minimumIndex = x;
                }
            }
            String temp = words.set(i, words.get(minimumIndex));
            words.set(minimumIndex, temp);
            System.out.println("SELECTION SORT: Number of loop iterations: " + count);
       }
    }


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