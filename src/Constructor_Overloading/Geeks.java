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
class Geeks {
    // constructor with one argument (String)
    Geeks(String name) {
        System.out.println("Constructor with one "
                + "argument - String: " + name);
    }

    // constructor with two arguments (String dan int)
    Geeks(String name, int age) {
        System.out.println(
                "Constructor with two arguments: "
                + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different type (long)
    Geeks(long id) {
        System.out.println(
                "Constructor with one argument: "
                + "Long: " + id);
    }
}
