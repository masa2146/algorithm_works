package org.blt.median2sortedarrays;

public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Length = nums1.length, num2Length = nums2.length, i = 0, j = 0, k = 0;
        int[] arr = new int[num1Length + num2Length];
        int medianIndex = (num1Length + num2Length) / 2;

        while (i <= num1Length - 1 || j <= num2Length - 1) {
            if (i >= num1Length) {
                arr[k] = nums2[j++];

            } else if (j >= num2Length) {
                arr[k] = nums1[i++];
            } else if (i <= num1Length - 1 && j <= num2Length - 1) {
                arr[k] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            }
            if (k == medianIndex) {
                if (k == 0)
                    return arr[k];
                if ((num1Length+num2Length) % 2 != 0) {
                    return arr[k];

                } else
                    return (((double) arr[k - 1] + (double) arr[k]) / (double) 2);
            }
            k++;
        }
        return 0;
    }
}
