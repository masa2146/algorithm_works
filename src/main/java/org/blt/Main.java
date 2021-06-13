package org.blt;

import org.blt.addtwonumbers.AddTwoNumbers;
import org.blt.addtwonumbers.ListNode;
import org.blt.median2sortedarrays.MedianTwoSortedArrays;
import org.blt.regularexpression.RegularExpression;
import org.blt.regularexpression.RegularExpression2;
import org.blt.regularexpression.RegularExpression3;
import org.blt.trappingrainwater.TrappingRainWater;
import org.blt.twosum.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        twoSum();
//        trappingRainWater();
//        addTwoNumbers();
//        medianTwoSortedArrays();
        regularExp();
    }


    public static void trappingRainWater() {
//        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int[] height = new int[]{4,2,0,3,2,5};
        int[] height = new int[]{6, 5, 4, 3, 2, 3, 4, 5, 6};
//        int[] height = new int[]{3,0,3,0,3,0,3};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(height));
    }

    public static void twoSum() {
//        int[] nums = new int[]{2, 7, 11, 15}, target = new int[]{9};
//        int[] nums = new int[]{3, 2, 4} target = new int[]{6};
        int[] nums = new int[]{3, 3}, target = new int[]{6};
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target[0])));
    }

    public static void addTwoNumbers() {
//        int[] arr1 = new int[]{2, 4, 3}, arr2 = new int[]{5, 6, 4}; // RESULT: [7,0,8]
//        int[] arr1 = new int[]{0}, arr2 = new int[]{0}; // RESULT: [0]
        int[] arr1 = new int[]{9, 9, 9, 9, 9, 9, 9}, arr2 = new int[]{9, 9, 9, 9}; // RESULT: [8,9,9,9,0,0,0,1]
        ListNode l1 = ListNode.createListNode(arr1);
        ListNode l2 = ListNode.createListNode(arr2);
        System.out.println(l1);
        System.out.println(l2);

        long startTime = System.currentTimeMillis();

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
        long stopTime = System.currentTimeMillis();
        System.out.printf("%d - %d = %d", stopTime, startTime, stopTime - startTime);
    }

    public static void medianTwoSortedArrays() {
        long startTime = System.currentTimeMillis();
//        int[] nums1 = new int[]{1,3}, nums2 = new int[]{2}; // RESULT: 2
//        int[] nums1 = new int[]{1,2}, nums2 = new int[]{3,4}; // RESULT: 2.5
//        int[] nums1 = new int[]{0}, nums2 = new int[]{0}; // RESULT: 0.0
//        int[] nums1 = new int[]{}, nums2 = new int[]{1}; // RESULT: 1.0
        int[] nums1 = new int[]{2}, nums2 = new int[]{}; // RESULT: 2.0
//        int[] nums1 = new int[]{}, nums2 = new int[]{2,3}; // RESULT: 2.5
//        int[] nums1 = new int[]{}, nums2 = new int[]{1,2,3,4,5}; // RESULT: 3.0
//        int[] nums1 = new int[]{17,22}, nums2 = new int[]{1,2,3,4,5,68}; // RESULT: 3.0
        MedianTwoSortedArrays medianTwoSortedArrays = new MedianTwoSortedArrays();
        System.out.println(medianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
        long stopTime = System.currentTimeMillis();
        System.out.printf("%d - %d = %d", stopTime, startTime, stopTime - startTime);
    }

    private static void regularExp() {
        RegularExpression regularExpression = new RegularExpression();
        List<String> data = new ArrayList<>();
        data.add("aa a"); //0
        data.add("aaa a.a"); //1
        data.add("aaa a*"); //2
        data.add("aabb b*"); //3
        data.add("aab c*a*b"); //4
        data.add("ab .*"); //5
        data.add("mississippi mis*is*p*."); //6
        data.add("mississippi mis*is*ip*."); //7
        data.add("mississippi s*p*."); //8
        data.add("abbbs a.b*."); //9
        data.add("aaa a*a"); //10
        data.add("aaa ab*a*c*a"); //11
        data.add("aaa aaaa"); //12
        data.add("aaca ab*a*c*a"); //13
        data.add("aaba ab*a*c*a"); //14
        data.add("aaa .*"); //15
        data.add("a ab*a"); //16
        data.add(" a*"); //17
        data.add("aa aa"); //18
        data.add("aa a*"); //19
        data.add("ab .*c"); //20
        data.add("a .*..a*"); //21
        data.add("ab .*.."); //22
        data.add("ab c*a*b"); //22



//        String s = "aa", p = "a"; //false
//        String s = "aaa", p = "a.a"; //true
//        String s = "aa", p = "a*"; //true
//        String s = "aabb", p = "b*"; // false
//        String s = "aab", p = "c*a*b"; // true
//        String s = "ab", p = ".*";
//        String s = "mississippi", p = "mis*is*p*.";
//        String s = "mississippi", p = "mis*is*ip*.";
//        String s = "mississippi", p = "s*p*.";
//        String s = "abbbs", p = "a.b*."; //
//        String s = "aaa", p = "a*a"; //
//        String s = "aaa", p = "ab*a*c*a"; //
//        regularExpression.isMatch(s, p);

        int index = 3;
//        for (index = 15 ; index < data.size(); index++) {
            System.out.println("\n ==================================================== \n");
            System.out.println("INDEX: " + index);
            String s = data.get(index).split(" ")[0];
            String p = data.get(index).split(" ")[1];
            System.out.println(s.matches(p));
            System.out.println(regularExpression.isMatch(s, p));
//        }

//        System.out.println(s.matches(p));
    }
}
