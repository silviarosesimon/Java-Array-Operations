package com.grokkingthecoding.warmup;

//O(n), O(1)
public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word1 ="fox";
        String word2 = "dog";
        System.out.println("Shortest distance between "+
                word1 + " and " + word2 + " is " +
                shortestDistance(words,word1,word2) + " words");
    }
    public static int shortestDistance(String[] words, String word1, String word2) {
        if(word1.equalsIgnoreCase(word2)) {
            return 0;
        }
        int distance = Integer.MAX_VALUE;
        int lastPos = -1;
        for(int i=0; i<words.length; i++) {
            if (words[i].equalsIgnoreCase(word1) || words[i].equalsIgnoreCase(word2)) {
                if (lastPos == -1) {
                    lastPos = i;
                } else {
                    if (words[lastPos].equalsIgnoreCase(words[i])) {
                        lastPos = i;
                    } else {
                        distance = Math.min(distance, (i - lastPos) - 1);
                        lastPos = i;
                    }
                }
            }
        }
        return distance;
    }
}
