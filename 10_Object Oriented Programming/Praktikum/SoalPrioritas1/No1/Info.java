/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOrientedProgramming.SoalPrioritas1.No1;

/**
 *
 * @author Dika Sulaeman Akbar
 */
public class Info {
   public static void main(String[] args) {
        // Membuat objek-objek produk
        data produk1 = new data("coffee", "this is coffee", 15000, 10);
        data produk2 = new data("milk", "this is milk", 25000, 20);
        data produk3 = new data("apple juice", "this is apple juice", 18000, 20);

        // Menampilkan informasi produk
        System.out.println("Info Produk :");
        produk1.getInfo();
        System.out.println("\nInfo Produk :");
        produk2.getInfo();
        System.out.println("\nInfo Produk :");
        produk3.getInfo();
    }
    
}
