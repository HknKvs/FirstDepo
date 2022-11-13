package DersALıştırma;

import java.util.Scanner;

public class KdvHesaplama {

    //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV
    // tutarını hesaplayıp ekrana bastıran programı yazın.
    //(Not : KDV tutarını 18% olarak alın)
    //KDV'siz Fiyat = 10;
    //KDV'li Fiyat = 11.8;
    //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
    // KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almış olduğunuz ürünün miktarını giriniz: ");
        int miktar = scan.nextInt();
        System.out.println("Lütfen almış olduğunuz ürünün fiyatını giriniz");
        double tutar = scan.nextDouble();
        double toplamTutar = miktar * tutar;

        if (toplamTutar >= 1000) {
            System.out.println("Almış olduğunuz ürünün KDV.siz tutarı: " + toplamTutar);
            System.out.println("Almış olduğunuz ürünün KDV.li tutarı: " + (toplamTutar * 1.08));
        } else {
            System.out.println("Almış olduğunuz ürünün KDV.siz tutarı: " + toplamTutar);
            System.out.println("Almış olduğunuz ürünün KDV.li tutarı: " + (toplamTutar * 1.18));
        }
    }


}
