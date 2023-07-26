package com.grokkingthecoding.warmup;

import java.util.HashSet;

//O(N), O(N)
public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        // TODO: Write your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }

}
