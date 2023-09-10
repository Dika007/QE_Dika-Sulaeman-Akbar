/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterableDataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Dika Sulaeman Akbar
 */
public class TaskNo2 {
      public static void main(String[] args) {
        String input = "76523752";
        List<Integer> hasil = cariduplikat(input);

        System.out.println(hasil);
    }

    public static List<Integer> cariduplikat(String input) {
        List<Integer> karakterList = new ArrayList<>();
        Set<Character> karakterSet = new HashSet<>();

        for (char karakter : input.toCharArray()) {
            int angka = Character.getNumericValue(karakter);
            if (!karakterSet.contains(karakter) && input.indexOf(karakter) == input.lastIndexOf(karakter)) {
                karakterList.add(angka);
                karakterSet.add(karakter);
            }
        }

        return karakterList;
    }
}
