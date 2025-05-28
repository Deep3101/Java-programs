package com.codeprac.qpaixcodingque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceBetweenTimePoints {

    public static int findMinimumDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] timePointParts = timePoint.split(":");
            int hours = Integer.parseInt(timePointParts[0]);
            int minutes = Integer.parseInt(timePointParts[1]);
            minutesList.add(hours == 0 && minutes == 0 ? 1440 : hours * 60 + minutes);
        }

        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < minutesList.size(); i++) {
            int diff = minutesList.get(i) - minutesList.get(i-1);
            minDifference = Math.min(minDifference, diff);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("23:59","00:00");
        int minDifference = findMinimumDifference(timePoints);
        System.out.println("Minimum difference: " + minDifference);
    }
}
