package DersALıştırma;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int yil;
        boolean ArtikYil = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir yil giriniz");

        yil = scan.nextInt();
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    ArtikYil = true;
                } else
                    ArtikYil = false;
            } else
                ArtikYil = true;
        } else
            ArtikYil = false;

        if (ArtikYil == true) {
            System.out.println(yil + " artık yıldır. ");
        } else
            System.out.println(yil + " artık yıl degildir. ");
    }
}

