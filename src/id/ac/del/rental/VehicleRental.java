/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/** 
 * NIM  : 41425042
 * Nama : Citra Sitorus
 * PRODI: D4 - TRPL
 */
public class VehicleRental {
    public String plateNumber;
    protected double rentalRatePerDay;
    private int rentalDays;
    double discountRate;
    
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }
 public void setRentalDays(int days) {
 this.rentalDays = days;
 }
 public double getTotalCost() {
 return (rentalRatePerDay * rentalDays) -
 (rentalRatePerDay * rentalDays * discountRate);
 }
}
}
