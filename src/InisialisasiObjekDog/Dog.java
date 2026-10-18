/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */
public class Dog {
    String name;
    String breed;
    int age;
    String color;

    // Constructor untuk mengisi semua atribut saat objek dibuat
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1: getter untuk mengambil nama
    public String getName() {
        return name;
    }

    // method 2: getter untuk mengambil ras
    public String getBreed() {
        return breed;
    }

    // method 3: getter untuk mengambil umur
    public int getAge() {
        return age;
    }

    // method 4: getter untuk mengambil warna
    public String getColor() {
        return color;
    }

    // Override toString() agar objek dicetak dalam format yang kita tentukan
    @Override
    public String toString() {
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }

    public static void main(String[] args) {
        // Membuat objek tuffy memakai keyword new (memanggil constructor)
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        // Mencetak objek lewat toString()
        System.out.println(tuffy.toString());
    }
}

