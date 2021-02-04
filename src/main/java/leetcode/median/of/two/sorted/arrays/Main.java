package leetcode.median.of.two.sorted.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums1 = {2};
        int[] nums2 = {};
        System.out.println(main.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        if (mergedArray.length == 1) {
            return mergedArray[0];
        }
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        }
        int firstIndex = mergedArray.length / 2 - 1;
        int secondIndex = mergedArray.length / 2;
        return (mergedArray[firstIndex] + mergedArray[secondIndex]) / 2D;
    }

    private int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[index++] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[index++] = secondArray[i];
        }
        return mergedArray;
    }
}
