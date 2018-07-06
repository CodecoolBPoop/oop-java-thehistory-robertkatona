package com.codecool.thehistory;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;


public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] textArray = text.split("\\s");
        wordsArray = new String[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            wordsArray[i] = textArray[i];
        }
        /*
        int theLengthOfNewArray = wordsArray.length + 1;
        String[] temporaryArray = new String[theLengthOfNewArray];
        for (int i = 0; i < wordsArray.length; i++) {
            temporaryArray[i] = wordsArray[i];
        }
        temporaryArray[temporaryArray.length - 1] = text;
        wordsArray = temporaryArray;
        */
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        int counter = 0;
        for (String word : wordsArray) {
            if (word.equals(wordToBeRemoved)) {
                counter += 1;
            }
        }
        int tempArrayLength = wordsArray.length - counter;
        String[] tempArray = new String[tempArrayLength];

        int index = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(wordToBeRemoved)) {
                continue;
            } else {
                tempArray[index] = wordsArray[i];
                index += 1;
            }
        }
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        int textSize = wordsArray.length;
        System.out.println(textSize);
        return textSize;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        String[] tempArray = new String[0];
        wordsArray = tempArray;
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(from)) {
                wordsArray[i] = to;
            }
        }
    }
    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
