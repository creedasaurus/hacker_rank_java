package com.stoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Stats Challenge 1
        ArrayList<Integer> nums = new ArrayList(Arrays.asList(64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060));

        System.out.println(nums.stream().reduce(0, (x,y) -> x+y)/(double)10);
        Collections.sort(nums);

        if (nums.size() % 2 == 0) {
            System.out.println((nums.get(nums.size()/2) + nums.get((nums.size()/2 -1)))/2.0);
        } else {
            System.out.println(nums.get(nums.size()/2+1));
        }


        Integer freq = 0;
        Integer max = 0;
        for (Integer n: nums) {
            if (Collections.frequency(nums, n) > freq) {
                freq = Collections.frequency(nums, n);
                max = n;
            }
        }
        System.out.println(max);
        // End stats Challenge!

    }
}
