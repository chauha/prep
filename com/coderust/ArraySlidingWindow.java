package com.coderust;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArraySlidingWindow {

    public static void findMaxInSlidingWindow(int[] input, int windowSize) {
        ArrayDeque<Integer> window = new ArrayDeque<>();
        for (int index = 0; index < windowSize; index++) {
            while (!window.isEmpty() && input[window.peekLast()] < input[index]) {
                window.remove(window.peekLast());
            }
            window.add(index);
            System.out.println(input[window.peekFirst()]);
        }



        for (int index = windowSize; index < input.length; index++) {
            while (!window.isEmpty() && input[window.peekLast()] < input[index]) {
                window.remove(window.peekLast());
            }
            if (!window.isEmpty() && window.peekFirst() <= (index - windowSize))
                window.removeFirst();
            window.add(index);
            System.out.println(input[window.peekFirst()]);
        }


    }

    public static void main(String[] args) {
        int[] array1 = new int[]{-4, 2, -5, 1,-1, 6};
        findMaxInSlidingWindow(array1, 3);


    }

}
