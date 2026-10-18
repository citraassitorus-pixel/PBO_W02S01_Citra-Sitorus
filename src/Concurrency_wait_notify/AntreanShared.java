/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency_wait_notify;

/**
 * Nama: Citra Sitorus
 * NIM : 41425042
 * PRODI: D4 - TRPL
 */

class AntreanShared {
    private String data;               
    private boolean adaData = false;    

    // Method untuk memproduksi data
    public synchronized void kirimPesan(String pesan) {
        while (adaData) {
            try {
                
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan;
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);

      
        notify();
    }

    
    public synchronized String ambilPesan() {
        while (!adaData) {
            try {
 
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;
        System.out.println("Pesan diterima: " + data);


        notify();
        return data;
    }
}
