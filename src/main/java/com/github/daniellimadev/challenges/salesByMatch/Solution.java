package com.github.daniellimadev.challenges.salesByMatch;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> colorCount = new HashMap<>();

        for (int color : ar) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        int pairs = 0;
        for (int count : colorCount.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> ar = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }

    /*
          Put it in the terminal
          9
          10 20 20 10 10 30 50 10 20
        * */
}
