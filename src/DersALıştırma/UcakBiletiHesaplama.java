package DersALıştırma;

import java.util.Scanner;

public class UcakBiletiHesaplama {

    public static void main(String[] args) {

        // Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan
        // programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        // sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi
        // ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı
        // verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        //Örnek Ekran Çıktısı
        //Mesafeyi km türünden giriniz : 200
        //Yaşınızı giriniz : 35
        //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
        //
        //Toplam Tutar = 20.0 TL

        double mesafe = 0;
        int yas = 0;
        char tip = 0;
        double mesafeucret = mesafe * 0.10;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km cinsinden giriniz");
        mesafe = scan.nextInt();
        if (mesafe < 0) {
            System.out.println("hatalı veri girişi");
        } else {
            System.out.println("indirmsiz ödeyeceğiniz ücret: " + (mesafe * 0.10) + " Tl.dir.");

            System.out.println("Lütfen yaşınızı giriniz");
            yas = scan.nextInt();
        }

        if (yas < 0) {
            System.out.println("hatalı veri girişi");
        }

        else if (yas >0 ) {
            System.out.println("LÜtfen yolculuk tipini seçiniz" + "\nTek Yön=> 1 \nGidiş Dönüş=> 2");
        }


        tip = scan.next().charAt(0);

        if (tip == '1') {

            if (yas < 12) {
                System.out.println("Ödenecek toplam tutar:" + ((mesafe * 0.10) * 0.50) + " TL.dir.");
            } else if (yas >= 12 && yas <= 24) {
                System.out.println("Ödenecek toplam tutar:" + ((mesafe * 0.10) * 0.90) + " Tl.dir.");
            } else if (yas > 24 && yas <= 65) {
                System.out.println("Ödenecek toplam tutar:" + (mesafe * 0.10) + " Tl.dir.");
            } else {
                System.out.println("Ödenecek toplam tutar:" + ((mesafe * 0.10) * 0.70) + " TL.dir.");
            }
        } else if (tip == '2') {
            if (yas < 12) {
                System.out.println("Ödenecek toplam tutar:" + (((mesafe * 0.10 * 2) * 0.70) * 0.50) + " TL.dir.");
            } else if (yas >= 12 && yas <= 24) {
                System.out.println("Ödenecek toplam tutar:" + (((mesafe * 0.10 * 2) * 0.70) * 0.90) + " Tl.dir.");
            } else if (yas > 24 && yas <= 65) {
                System.out.println("Ödenecek toplam tutar:" + (mesafe * 0.10 * 2) + " Tl.dir.");
            } else if (yas > 65) {
                System.out.println("Ödenecek toplam tutar:" + (((mesafe * 0.10 * 2) * 0.70) * 0.70) + " TL.dir.");
            }
        }
        else {
            System.out.println("Hatalı veri girişi");}
    }

}
