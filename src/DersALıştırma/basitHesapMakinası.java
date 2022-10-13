package DersALıştırma;

import java.util.Scanner;

public class basitHesapMakinası {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı girmesini isteyiniz.
        // Daha sonra kullanıcıdan hangi matemmatiksel işlemi yapmak istediğini sorun
        // tercih ettiği işlemi yapın

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen 1.sayıyı giriniz");
        int birinciSayi= scan.nextInt();
        System.out.println("LÜtfen 2.sayıyı giriniz");
        int ikinciSayi= scan.nextInt();

        System.out.println("***İŞLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.println("Seçiminiz Yapınız:");
        int secim = scan.nextInt();

        if (secim==1) {
            System.out.println("Toplama İşlemi Sonucu: " + (birinciSayi+ikinciSayi));
        } else if (secim==2) {
            System.out.println("Çıkarma İşlemi Sonucu " + (birinciSayi-ikinciSayi));
        } else if (secim==3) {
            System.out.println("Çarpma İşlemi Sonucu: " + (birinciSayi*ikinciSayi));
        } else if (secim==4) {
            System.out.println("Bölme İşlemi Sonucu: " + (birinciSayi/ikinciSayi));
        } else { System.out.println("Yanlış İşlem Girişi"); }

    }
}