package DersALıştırma;

import java.util.Scanner;

public class UsluSayiHesapla {

    //Java ile kullanıcının girdiği
    // değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Hesaplnacak üs sayıyı giriniz: ");
        int us = scan.nextInt();
        int usluSayi=1;

        for (int i = 1; i <= us; i++) {

            usluSayi*=sayi;

        }
        System.out.println(usluSayi);



    }

}
