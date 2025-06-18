package com.codeprac.leetcode;

public class ContainsDuplOrNot {
    public static void main(String[] args) {
        int[] num = {1,2,3,3,5,6,7};

        System.out.println(containsDuplOrNot(num));
    }

    private static boolean containsDuplOrNot(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
