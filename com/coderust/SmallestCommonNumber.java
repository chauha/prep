package com.coderust;

public class SmallestCommonNumber {

    public static int findSmallectCommon(int[] a, int[] b, int[] c) {
        int indexa = 0, indexb = 0, indexc = 0;
        while (indexa < a.length && indexb < b.length && indexc < c.length) {
            if (a[indexa] == b[indexb] && a[indexa] == c[indexc]) {
                return a[indexa];
            }
            if (a[indexa] < b[indexb] && a[indexa] < c[indexc]) {
                indexa++;
            }
            if (b[indexb] < a[indexa] && b[indexb] < c[indexc]) {
                indexb++;
            } else {
                indexc++;
            }

        }


        return -1;

    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{-1, 3, 4, 6, 7};
        int[] arr2 = new int[]{2, 3, 5, 6, 9};
        int[] arr3 = new int[]{0, 1, 3, 4, 7, 9};
        System.out.println(findSmallectCommon(arr1, arr2, arr3));
    }
}
