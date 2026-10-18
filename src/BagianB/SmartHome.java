/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/** 
 * NIM  : 41425042
 * Nama : Citra Sitorus
 * PRODI: D4 - TRPL
 */

// Interface untuk menyalakan dan mematikan perangkat
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface untuk menghubungkan perangkat ke WiFi
interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

// Class SmartLamp
class SmartLamp implements Switchable, Connectable {

    private int brightness;
    private boolean isOn;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lampu menyala.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lampu mati.");
    }

    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("Lampu terhubung ke WiFi " + ssid);
        } else {
            System.out.println("Lampu belum menyala, tidak bisa terhubung WiFi.");
        }
    }
}

// Class SmartAC
class SmartAC implements Switchable, Connectable {

    private double temperature;
    private boolean isOn;

    public SmartAC(double temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("AC menyala.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("AC mati.");
    }

    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("AC terhubung ke WiFi " + ssid);
        } else {
            System.out.println("AC belum menyala, tidak bisa terhubung WiFi.");
        }
    }
}

// Class utama
public class SmartHome {

    public static void main(String[] args) {

        SmartLamp lampu = new SmartLamp(80);
        SmartAC ac = new SmartAC(24);

        // Lampu
        lampu.turnOn();
        lampu.connectToWifi("Rumah-Citra", "192.168.1.10");
        lampu.turnOff();

        System.out.println();

        // AC
        ac.turnOn();
        ac.connectToWifi("Rumah-Citra", "192.168.1.11");
        ac.turnOff();
    }
}