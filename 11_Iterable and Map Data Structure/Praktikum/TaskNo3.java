/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterableDataStructure;

import java.util.Arrays;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class TaskNo3 {
     public static void main(String[] args) {
        int[] nomor = {2, 5, 9, 11};
        int target = 11;

        int[] result = mencariindex(nomor, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] mencariindex(int[] nomor, int target) {
        int left = 0;
        int right = nomor.length - 1;

        while (left < right) {
            int currentSum = nomor[left] + nomor[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[0];
    }
}
