package DersALıştırma;

import java.util.Scanner;

public class OrtalamaHesaplama {

    //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
    // alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
    //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise
    // ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

    public static void main(String[] args) {

        Double matematik, fizik, kimya, turkce, tarih, muzik, notOrtalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almış olduğunuz notlarınızı giriniz :");
        System.out.println("Matematik: ");
        matematik= scan.nextDouble();
        System.out.println("Fizik: ");
        fizik= scan.nextDouble();
        System.out.println("Kimya: ");
        kimya= scan.nextDouble();
        System.out.println("Türkçe: ");
        turkce= scan.nextDouble();
        System.out.println("Tarih: ");
        tarih= scan.nextDouble();
        System.out.println("Müzik: ");
        muzik= scan.nextDouble();

        notOrtalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        if (notOrtalama>=60) {
            System.out.println("Tebrikler. Sınıfı Geçtiniz");}
        else {
            System.out.println("Sınıfta Kaldınız");}

    }

}
