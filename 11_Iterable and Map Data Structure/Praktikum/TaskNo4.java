/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterableDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Dika Sulaeman Akbar
 */
public class TaskNo4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};

        int[] result = ArrayUnique(array1, array2);
        
        System.out.println(Arrays.toString(result));
    }

    public static int[] ArrayUnique(int[] arr1, int[] arr2) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num1 : arr1) {
            boolean isUnique = true;

            for (int num2 : arr2) {
                if (num1 == num2) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueList.add(num1);
            }
        }

        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }
}
