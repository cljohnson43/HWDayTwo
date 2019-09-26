package com.example.hwdaytwo;

public class ProblemTwo {
    private String tag = "ProblemTwo";

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean checkPalindrome(String word){
        if (word == null) { return false; }
        
        String lowerWord = word.toLowerCase();

        int len = lowerWord.length();
        for (int i = 0; i < len; i++){
            if (lowerWord.charAt(i) != lowerWord.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
