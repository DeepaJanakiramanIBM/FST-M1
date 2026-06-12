package com.activities;

public class Activity4 {

    public static void main(String[] args) {
        int num[] = {2, 5, 1, 6, 3, 4, 12, 10};

        System.out.println("Array before sorting:");
        printArray(num);

        // Insertion Sort logic
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = key;
        }

        // Display after sorting
        System.out.println("Array after sorting:");
        printArray(num);
    }

    // Method to print array
    public static void printArray(int[] num) {
        for (int numb : num) {
            System.out.print(numb + " ");
        }
        System.out.println();
    }
}