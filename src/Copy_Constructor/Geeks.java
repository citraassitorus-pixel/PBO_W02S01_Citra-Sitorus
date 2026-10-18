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
    class Geeks {

    String name;
    int id;

    // Parameterized Constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor: menyalin data dari objek lain
    Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
