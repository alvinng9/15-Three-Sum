package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //initialize the hashset of list of integer to avoid duplicates
        HashSet<List<Integer>> result = new HashSet<>();

        //sort the given array from least to most
        Arrays.sort(nums);

        //iterate through the modified array
        for (int i = 0; i < nums.length - 2; i++) {
            //initialize int j and int k
            int j = i + 1;
            int k = nums.length - 1;
            // check each j and k
            while (j < k) {
                //add nums at j and k if the sum of i, j, k equals to 0
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                    // modify j if the sum is less than 0
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                    // modify k if the sum is bigger than of equal to 0
                } else {
                    k--;
                }
            }
        }
        return new ArrayList(result);
    }
}
