package com.example.hwdaytwo;

import java.util.Arrays;

public class ProblemFour {
    private String tag = "ProblemFour";

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean checkAnagrams(String word1, String word2) {
        if (word1 == null || word2 == null) { return false; }
        if (word1.length() != word2.length()) { return false; }

        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();

        // sort the char arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) { return false; }
        }

        return true;
    }
}
