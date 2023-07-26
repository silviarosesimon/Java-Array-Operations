package com.grokkingthecoding.warmup;

import java.util.HashMap;

//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
public class GoodPair {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(goodPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {

        int ans = 0;
        int[] count = new int[101];

        for(int n: nums) {
            //ans += count[n];
            count[n]++;
        }

        for(int n: count)
            ans += (n * (n - 1))/2;

        return ans;
    }
    public static int goodPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        for(int i: map.keySet()) {
            if(map.get(i) > 1) {
                int n = map.get(i);
                count  += n*(n-1)/2;
            }
        }

        return count;
    }
}
