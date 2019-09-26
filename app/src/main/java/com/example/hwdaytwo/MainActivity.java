package com.example.hwdaytwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Problem One
        ProblemOne prob1 = new ProblemOne();
        List<String> prob1Cases = new ArrayList<String> (Arrays.asList( "Today", "January", "golf", "today", "this", "should", "be", "today"));

        Log.d(prob1.getTag(), "findDuplicates using list: " + prob1Cases);
        prob1.findDuplicates(prob1Cases);

        // Problem Two
        ProblemTwo prob2 = new ProblemTwo();
        ArrayList<String> prob2Cases = new ArrayList<String>(Arrays.asList("Palindrome", "Palolap", "paaP", "RUN nur"));

        Log.d(prob2.getTag(), "checkPalindrome using the following list: " + prob2Cases);

        for( String el : prob2Cases) {
            Log.d(prob2.getTag(), el + ((prob2.checkPalindrome(el)) ? " is" : " is not") + " a palindrome.");
        }

        // Problem Three
        ProblemThree prob3 = new ProblemThree();
        int[] prob3Cases = new int[]{ 1, 0, 3, 5, 15, 9, 8 };

        for( int i = 0; i < prob3Cases.length; i++) {
            Log.d(prob3.getTag(), "Case " + prob3Cases[i] + ": " + prob3.checkFizzBuzz(prob3Cases[i]));
        }

        // Problem Four
        ProblemFour prob4 = new ProblemFour();
        List<Pair<String, String>> prob4Cases = new ArrayList<Pair<String, String>>();
        prob4Cases.add(new Pair("coat", "Cota"));
        prob4Cases.add(new Pair("", "Cota"));
        prob4Cases.add(new Pair(null, ""));
        prob4Cases.add(new Pair("", ""));
        prob4Cases.add(new Pair("coat", "coate"));

        for(Pair<String, String> pair : prob4Cases) {
            Log.d(prob4.getTag(), pair.first + " and " + pair.second + " are" + (prob4.checkAnagrams(pair.first, pair.second) ? "" : " not") + " anagrams.");
        }

        // Problem 5
        ProblemFive prob5 = new ProblemFive();
        prob5.printTables();
    }
}
