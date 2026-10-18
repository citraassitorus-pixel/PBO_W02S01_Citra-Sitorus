/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Getter_Setter_Contoh2;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class GetSet {
    private int num;

    // Method 1 - Setter dengan validasi: nilai harus 1 sampai 10
    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            // Jika di luar rentang, lempar error
            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Method 2 - Getter
    public int getNumber() { return num; }
}
