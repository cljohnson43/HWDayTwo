package com.example.hwdaytwo;

import android.util.Log;

public class ProblemFive {
    private String tag = "ProblemFive";

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void printTables(){
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (j + 1) * (i + 1);
            }

            Log.d(this.getTag(), String.format("%d %d %d %d %d %d %d %d %d %d",
                    arr[i][0],
                    arr[i][1],
                    arr[i][2],
                    arr[i][3],
                    arr[i][4],
                    arr[i][5],
                    arr[i][6],
                    arr[i][7],
                    arr[i][8],
                    arr[i][9]
                    ));
        }

    }
}
