/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clone_Geeks;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */

    class Geeks implements Cloneable {
    // method 1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // super mengacu ke parent class 
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) { // method 2
        Geeks o1 = new Geeks(); // objek asli

        try {
            Geeks o2 = (Geeks) o1.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
