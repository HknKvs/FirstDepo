package DersALıştırma;

import java.util.Scanner;

public class AtmSorusu {

    public static void main(String[] args) {


        // kullanıcıdan daha önceden kayıtlı kullanıcı adı ve şifresini alın.
        // 3 kere yanlış girme hakkı var fazla girerse bloke edin
        // para yatırma, para çekme, bakiye sorgulama , çıkış menüleri bulunsun.

        String kullaniciAdi, parola;

        Scanner scan = new Scanner(System.in);
        String userName = "Java", password = "Ankara06";
        int kalanHak = 3;
        int bakiye = 1500;
        int secim;

        while (kalanHak > 0) {
            System.out.println("Kullanıcı Adınız: ");
            kullaniciAdi = scan.nextLine();
            System.out.println("Parolanız: ");
            parola = scan.nextLine();

            if (kullaniciAdi.equals(userName) && parola.equals(password)) {
                System.out.println("Merhaba X Bankasına Hoşgeldiniz");

                do {
                    System.out.println("1-Para Yatırma" +
                            "\n2-Para Çekme" +
                            "\n3-Bakiye Sorgula" +
                            "\n4-Çıkış");
                    System.out.println("Lütfen yapmak istediğiniz işlemi giriniz: ");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Lütfen yatımak istediğiniz miktarı giriniz:");
                            int eklenenMiktar = scan.nextInt();
                            bakiye += eklenenMiktar;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz");
                            int paraCekme = scan.nextInt();

                            if (paraCekme <= bakiye) {
                                bakiye -= paraCekme;
                            } else {
                                System.out.println("bakiye yetersiz");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("İyi günler");
                        default:
                    }
                } while (secim != 4);
                break;
            } else {
                kalanHak--;
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz");
            }

            if (kalanHak == 0) {
                System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz");
            } else {
                System.out.println("Kalan Hakkınız: " + kalanHak);
            }
        }
    }
}
