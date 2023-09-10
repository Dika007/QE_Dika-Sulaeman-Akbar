/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterableDataStructure;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class TaskNo5 {
     public static void main(String[] args) {
        int[] nomor = {2, 3, 3, 3, 6, 9, 9};
        int length = cekpanjangarray(nomor);
        
        System.out.println(length); 
    }

    public static int cekpanjangarray(int[] nomor) {
        if (nomor.length == 0) {
            return 0;
        }

        int uniqueCount = 1; 

        for (int i = 1; i < nomor.length; i++) {
            if (nomor[i] != nomor[i - 1]) {
                nomor[uniqueCount] = nomor[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
