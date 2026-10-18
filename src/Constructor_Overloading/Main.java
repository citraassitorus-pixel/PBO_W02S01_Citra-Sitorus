/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor_Overloading;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class Main {
    public static void main(String[] args) {
        // Java memilih constructor berdasarkan jumlah dan tipe argumen
        Geeks geek2 = new Geeks("Sweta");      // constructor String

        Geeks geek3 = new Geeks("Amiya", 28);  // constructor String, int

        Geeks geek4 = new Geeks(325614567);    // constructor long
    }
}
