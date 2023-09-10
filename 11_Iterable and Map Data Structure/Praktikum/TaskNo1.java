/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterableDataStructure;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dika Sulaeman Akbar
 */
public class TaskNo1 {
    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        String[] hasil = gabungArrayTanpaDuplikat(array1, array2);

        for (String elemen : hasil) {
            System.out.print(elemen + " ");
        }
    }

    public static String[] gabungArrayTanpaDuplikat(String[] array1, String[] array2) {
        List<String> hasilList = new ArrayList<>();
        for (String elemen : array1) {
            if (!hasilList.contains(elemen)) {
                hasilList.add(elemen);
            }
        }

        for (String elemen : array2) {
            if (!hasilList.contains(elemen)) {
                hasilList.add(elemen);
            }
        }

        String[] hasil = new String[hasilList.size()];
        hasil = hasilList.toArray(hasil);

        return hasil;
    }
}
