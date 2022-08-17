package main;

import java.util.Arrays;

public class Array {
    private final int[] arr;
    private final int size;

    public Array(){
        this.arr = new int[]{};
        size = 0;
    }
    public Array(int[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    private void quick(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[(i + j) / 2];
        do {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                i++;
                j--;
            }
        } while (i <= j);

        if (i < right) {
            quick(arr, i, right);
        }
        if (left < j) {
            quick(arr, left, j);
        }
    }

    public void quick_sort() {
        int n = this.size - 1;
        if(n > 0) {
            quick(this.arr, 0, n);
        }
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {

    }
}

