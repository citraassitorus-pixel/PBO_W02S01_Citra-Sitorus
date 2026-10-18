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
public class ObjectPassDemo {
    int a, b;

    // Constructor untuk mengisi a dan b
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}
