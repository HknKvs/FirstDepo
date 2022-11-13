package DersALıştırma;

import java.util.Scanner;

public class AnagramSorusu {

    //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
    //konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
    //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki kelime giriniz: ");
        String klm1 = scan.nextLine();
        String klm2 = scan.nextLine();
        int sayac = 0;

        if (klm1.length() != klm2.length()) {
            System.out.println("Anagram değildir.");
        } else {

            for (int i = 0; i < klm1.length(); i++) {

                String harf = klm1.substring(i,i+1);

                for (int j = 0; j < klm2.length(); j++) {
                    String harf2 = klm2.substring(j,j+1);
                    if (harf2.equals(harf))
                    {
                        sayac++;
                    }
                }
            } if (sayac==klm1.length()) {
                System.out.println("Anagramdır.");}
        }
    }
}






