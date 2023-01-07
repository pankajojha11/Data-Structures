package com.string;

public class JewelsStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        char[] c = jewels.toCharArray();


        return sum;
    }

    public static void main(String[] args) {
        String stones = "aAAbbbb";
        String jewels = "aA";

        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
}
