package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,6,4,8,9,56,7,834};
        int[] arr1 = {89,56,4,6,8123,45,98,786};
        int[] arr2 = {66, 7, 6, 1, 90, 8, 5};
        System.out.println(Arrays.toString(arr));
        SortingMethods sort = new SortingMethods();
        int[] result = sort.BubbleSort(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(arr1));
        result = sort.InsertionSort(arr1);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(arr2));
        result = sort.SelectionSort(arr2);
        System.out.println(Arrays.toString(result));
    }
}

