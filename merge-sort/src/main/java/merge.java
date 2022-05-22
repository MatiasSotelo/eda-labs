package src.main.java;

import java.util.Arrays;

class MergeSort<T extends Comparable<? super T>>  {
    void merge (T[]array, int lo, int mid, int hi) {
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, hi + 1);
        T[] leftArray = Arrays.copyOfRange(array, lo, mid + 1);

        int left = 0, right = 0;

        int current = lo;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left].compareTo(rightArray[right]) <= 0) {
                array[current] = leftArray[left];
                left++;
            } else {
                array[current] = rightArray[right];
                right++;
            }
            current++;
        }
        while (left < leftArray.length) 
            array[current++] = leftArray[left++];

        while (right < rightArray.length) 
            array[current++] = rightArray[right++];
    }
    void sort(T[] array, int lo, int hi) {
        if(lo >= hi) return;
        int mid = (lo+hi)/2;
        sort(array, lo, mid);
        sort(array, mid+1, hi);
        merge(array, lo, mid, hi);
    }
}