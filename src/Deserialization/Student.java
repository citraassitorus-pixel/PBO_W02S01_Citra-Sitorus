/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class Student {

class Student implements Serializable {
    String name;

    // Constructor untuk mengisi nama
    public Student(String name) {
        this.name = name;
    }

    // Menentukan tampilan objek saat dicetak
    @Override
    public String toString() {
        return "Student: " + name;
    }
}
}
