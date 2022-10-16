package DersALıştırma;

import java.util.Scanner;

public class BasitBankaAtm {

    public static void main(String[] args) {

        // kullanıcıdan adı ve şifresi
        // 3 kere yanlış girme hakkı
        // para yatırma, para çekme, bakiye sorgulama , çıkış

        String kullanıcıAdı, parola;
        Scanner scan = new Scanner(System.in);
        String userName = "Hakan", password = "Ankara06";
        int kalanHak = 3;
        int bakiye = 1500;
        int secim;

        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adınız : ");
            kullanıcıAdı = scan.nextLine();
            System.out.print("Parolanız : ");
            parola = scan.nextLine();

            if (kullanıcıAdı.equals(userName) && parola.equals(password)) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            int eklenenMiktar = scan.nextInt();
                            bakiye += eklenenMiktar;
                            System.out.println("Para Yatırma İşleminiz Tamamlandı");
                            break;
                        case 2:
                            System.out.println("Para Çekme :");
                            int paraCekme = scan.nextInt();

                            if (paraCekme <= bakiye) {
                                bakiye -= paraCekme;
                            } else {
                                System.out.println("Bakiye Yetersiz");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:" + bakiye);
                            break;
                        case 4:
                            System.out.println("Cikisi tercih ettiniz");
                        default:
                    }


                } while (secim != 4);
                break;
            } else {
                kalanHak--;
                System.out.println("Hatali giris tekrar deneyin");
                if (kalanHak == 0) {
                    System.out.println("Hesap Bloke oldu.Banka ile ileti");
                } else {
                    System.out.println("Kalan Hakkiniz" + kalanHak);
                }
            }
        }
    }

}


