/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Passing_Object_in_Method;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class Main {

    public static void main(String args[]) {
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Objek ob2 dan ob3 diteruskan ke method equalTo
        System.out.println("ob1 == ob2: "
                + ob1.equalTo(ob2)); // true
        System.out.println("ob1 == ob3: "
                + ob1.equalTo(ob3)); // false
    }
}
