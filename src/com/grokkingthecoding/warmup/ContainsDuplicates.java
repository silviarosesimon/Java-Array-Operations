package com.grokkingthecoding.warmup;

import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    @Test
    public void testContainsDuplicates() {
        Assert.assertFalse(containsDuplicate(new int[] {1,2,3,4}));
        Assert.assertTrue(containsDuplicate(new int[] {1,2,3,1}));
    }

    public boolean containsDuplicate(int[] nums) {
        //Brute Force Approach- O(N^2), O(1)
        /*for(int i=0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }*/
        // Set Approach - O(N), O(N) since Set
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            // add will add if not present, otherwise return false
            /*if(!set.add(i)) {
                return true;
            }*/
            // contains
           /* if(set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }*/
        }
        //Sort Approach - Dual-Pivot Quicksort O(n log(n)), O(1)
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
