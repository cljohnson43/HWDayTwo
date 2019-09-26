package com.example.hwdaytwo;

import android.util.Log;

import java.util.Collections;
import java.util.List;

public class ProblemOne {
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    private String tag = "ProblemOne";

    public void findDuplicates(List<String> strings){
        Collections.sort(strings);

        String last = strings.get(0).toLowerCase();
        for (int i = 1; i < strings.size(); i++) {
            String element = strings.get(i).toLowerCase();

            if (last.equals(element)) {
                Log.d(this.getTag(), "findDuplicates: " + last + " is a duplicate");
            }

            last = element;
        }
    };
}


