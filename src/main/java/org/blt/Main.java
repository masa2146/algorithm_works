package org.blt;

import org.blt.addtwonumbers.AddTwoNumbers;
import org.blt.addtwonumbers.ListNode;
import org.blt.median2sortedarrays.MedianTwoSortedArrays;
import org.blt.trappingrainwater.TrappingRainWater;
import org.blt.twosum.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        twoSum();
//        trappingRainWater();
        addTwoNumbers();
//        medianTwoSortedArrays();
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

    public static void medianTwoSortedArrays(){
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
        System.out.println(medianTwoSortedArrays.findMedianSortedArrays(nums1,nums2));
        long stopTime = System.currentTimeMillis();
        System.out.printf("%d - %d = %d", stopTime, startTime, stopTime - startTime);
    }
}
