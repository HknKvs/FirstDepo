package DersALıştırma;

import java.util.Scanner;

public class ManavSorusu {


    // * Basit bir 5 ürünlü manav alisveris programi yaziniz.
    // 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
    // 2. Adim :Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
    //    goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
    // 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatinı toplam fiyata ekle.
    // 4. Adim : Alisveris bitince toplam odemesi gereken tutar goster.

    public static void main(String[] args) {

        int secim = 1;
        double Armut = 18.50, Elma = 17, Mandalina = 19.90, Portakal = 21.30, Greyfurt = 25.60;
        double toplamMiktar = 0;
        double kilo;

        Scanner scan = new Scanner(System.in);
        while (secim > 0 && secim <= 5) {
            System.out.println("Lütfen almak istediğiniz ürünü seçiniz.Alışverişi Bitirmek için lütfen (6) tuşuna basınız." + "\n1-Elma" + "\n2-Armut" + "\n3-Mandalina" + "\n4-Portakal" + "\n5-Greyfurt");
            secim = scan.nextInt();

            if (secim == 6) {
                System.out.println("Alınan ürünlerin toplam tutarı: " + toplamMiktar + " TL.dir.");
                break;
            }

            System.out.println("Almak istediğiniz Miktarı Giriniz:");
            kilo = scan.nextDouble();

            if (secim <= 0 || secim > 6) {
                System.out.println("Toplam beş parça ürğn bulumkatadır hatalı giriş yaptınız.Tekrar deneyiniz.");
                break;
            }


            switch (secim) {
                case 1:
                    toplamMiktar += Elma * kilo;
                    System.out.println(toplamMiktar + "Tl.dir");
                    break;
                case 2:
                    toplamMiktar += Armut * kilo;
                    System.out.println(toplamMiktar + "Tl.dir");
                    break;
                case 3:
                    toplamMiktar += Mandalina * kilo;
                    System.out.println(toplamMiktar + "Tl.dir");
                    break;
                case 4:
                    toplamMiktar += Portakal * kilo;
                    System.out.println(toplamMiktar + "Tl.dir");
                    break;
                case 5:
                    toplamMiktar += Greyfurt * kilo;
                    System.out.println(toplamMiktar + "Tl.dir");
                    break;
            }


        }

    }
}
