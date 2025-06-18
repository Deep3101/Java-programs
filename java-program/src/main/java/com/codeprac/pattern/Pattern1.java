package com.codeprac.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){  // no. of rows
            for (int j = 1; j <= i; j++){ //numbers per row
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
