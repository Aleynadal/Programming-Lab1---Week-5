/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliveryservicesystem;


public class DeliveryServiceSystem {


    public static void main(String[] args) {
        Package standardPackage = new Package(
            "Ahmet Yılmaz", "123 Lale Sokak", "İstanbul", "TR", "34000",
            "Ayşe Demir", "456 Gül Caddesi", "Ankara", "TR", "06000",
            10.5, 2.0); // 10.5 ons, ons başına 2.0 TL

        System.out.println("Standart Paket Gönderim Ücreti: " + standardPackage.calculateCost() + " TL");

        
        TwoDayPackage twoDayPackage = new TwoDayPackage(
            "Veli Şahin", "789 Çam Yolu", "İzmir", "TR", "35000",
            "Zeynep Çelik", "321 Meşe Bulvarı", "Bursa", "TR", "16000",
            10.5, 2.0, 15.0); 

        System.out.println("İki Günlük Paket Gönderim Ücreti: " + twoDayPackage.calculateCost() + " TL");

       
        OvernightPackage overnightPackage = new OvernightPackage(
            "Can Yıldız", "555 Papatya Sokak", "Antalya", "TR", "07000",
            "Mert Kaya", "999 Sümbül Caddesi", "Adana", "TR", "01000",
            10.5, 2.0, 1.5); // 10.5 ons, ons başına 2.0 TL, ons başına 1.5 TL ek ücret

       ;
        System.out.println("=========================================");
        System.out.println("STANDART PAKET BİLGİLERİ");
        System.out.println("=========================================");
        standardPackage.displayInfo();
        System.out.println("Toplam Gönderim Ücreti: " + standardPackage.calculateCost() + " TL\n");

        System.out.println("=========================================");
        System.out.println("İKİ GÜNLÜK PAKET BİLGİLERİ (Sabit Ek Ücretli)");
        System.out.println("=========================================");
        twoDayPackage.displayInfo();
        System.out.println("Toplam Gönderim Ücreti: " + twoDayPackage.calculateCost() + " TL\n");

        System.out.println("=========================================");
        System.out.println("GECELİK PAKET BİLGİLERİ (Ons Başına Ek Ücretli)");
        System.out.println("=========================================");
        overnightPackage.displayInfo();
        System.out.println("Toplam Gönderim Ücreti: " + overnightPackage.calculateCost() + " TL\n");
    }
    }

    
    

