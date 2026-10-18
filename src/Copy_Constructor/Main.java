/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Copy_Constructor;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("First Object");
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);

        System.out.println();

        // geek2 dibuat dengan menyalin data geek1
        Geeks geek2 = new Geeks(geek1);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("GeekName: " + geek2.name
                + " and GeekId: " + geek2.id);
    }
}
