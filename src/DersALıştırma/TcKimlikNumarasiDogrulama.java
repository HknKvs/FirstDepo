package DersALıştırma;

import java.util.Scanner;

public class TcKimlikNumarasiDogrulama {

    public static void main(String[] args) {

        /*
        ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
        9 katının toplamının birler basamağı 10. rakamı; 1, 3, 5, 7 ve 9. rakamın toplamının
        8 katının birler basamağı 11. rakamı vermektedir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen TC kimlik numaranızı giriniz : ");
        System.out.println(tcKimlikNoKontrol(scan.next()));
    }
    public static boolean tcKimlikNoKontrol(String tcNo) {

        char arrChar[] = tcNo.toCharArray();
        int[] arr = new int[arrChar.length];
        for (int i = 0; i < arrChar.length; i++) {
            arr[i] = Integer.parseInt(arrChar[i] + "");
        }
        int ilkOnSayiToplam = 0;
        int sayi = 0;

        // 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı
        int tekSayiYediKatiBirlerBasamagi = ((arr[0] + arr[2] + arr[4] + arr[6] + arr[8]) * 7) % 10;
        //2, 4, 6 ve 8. rakamın toplamının 9 katının
        int ciftSayilarDokuzKatiBirlerBasamagi = ((arr[1] + arr[3] + arr[5] + arr[7]) * 9) % 10;
        int onuncuRakamiVerenSayi = tekSayiYediKatiBirlerBasamagi + ciftSayilarDokuzKatiBirlerBasamagi;
        int onbirinciRakamiVerenSayi = ((arr[0] + arr[2] + arr[4] + arr[6] + arr[8]) * 8) % 10;

        for (int i = 0; i < arr.length; i++) {

            ilkOnSayiToplam += (arr[i]);
        }
        ilkOnSayiToplam -= arr[10];
        sayi = ilkOnSayiToplam % 10;

        if (tcNo.length() != 11) {
            return false;
        } else if (tcNo.startsWith("0")) {
            return false;
        } else if (arr[10] != sayi) {
            return false;
        } else if (onuncuRakamiVerenSayi != arr[9]) {
            return false;
        } else if (onbirinciRakamiVerenSayi != arr[10]) {
            return false;
        } else {
            return true;
        }
    }
}
