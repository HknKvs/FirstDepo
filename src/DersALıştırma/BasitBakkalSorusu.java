package DersALıştırma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasitBakkalSorusu {
    //*
    // * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
    // * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
    // * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
    // * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
    // * kazandığını gösteren bir method yazınız.
    // *
    // * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
    // * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
    // * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
    // * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
    // * getOrtalamaKazanc() adlı method ile ortalama kazancı alın. 5. Adım :
    // * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
    // * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
    // * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
    // * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    // * ortalama kazançtan aşağıysa o günleri return yap.

    public static void main(String[] args) {

        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Integer> kazanc = new ArrayList<>();
        System.out.println("kazanci giriniz:");
        Scanner scan = new Scanner(System.in);


        while (kazanc.size() < 7) {

            kazanc.add(scan.nextInt());

        }
        System.out.println(kazanc);

        System.out.println(ortalamaKazanc(kazanc));

    }

    public static Integer  ortalamaKazanc(List <Integer> ortalamaKazanc) {
        int ortkazanc=0;
        List<Integer> kazanc = new ArrayList<>();

        for (int i = 0; i < kazanc.size(); i++) {

            ortkazanc+= kazanc.get(i);
            ortkazanc = ortkazanc / kazanc.size();

        }
        return ortkazanc;

    }
}
