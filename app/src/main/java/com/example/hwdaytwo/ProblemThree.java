package com.example.hwdaytwo;

public class ProblemThree {
    private String tag = "ProblemThree";

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String checkFizzBuzz(int number){
        if (number == 0) { return "fizzbuzz"; }

        boolean isDivisibleByFive = ((number % 5) == 0) ? true : false;
        boolean isDivisibleByThree = ((number % 3) == 0) ? true : false;
        if (isDivisibleByFive && isDivisibleByThree) { return "fizzbuzz"; }
        if (isDivisibleByFive) { return "buzz"; }
        if (isDivisibleByThree) { return "fizz"; }
        return "no fizzing or buzzing";
    }
}
