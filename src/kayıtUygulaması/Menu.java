package kayıtUygulaması;

import java.util.Scanner;

public class Menu {
    Registiration registiration = new Registiration();
    Listing listing = new Listing();

    void giris() {

        System.out.println("Yapmak İstediğiniz işlemi seciniz: \n" +
                "1. İsim Girişi\n" +
                "2. Şanslı İsimleri Listeleme\n" +
                "3. Çıkış\n" +
                "Seçiniz:");

        Scanner scan = new Scanner(System.in);

        while (true) {

            if (scan.hasNextInt()) {
                int secim = scan.nextInt();
                switch (secim) {
                    case 1: { registiration.register();
                            giris();
                    }
                    case 2: { listing.listele(registiration.userList);
                            giris();
                    }
                    case 3: {
                        System.out.println("Güle Güle");
                        System.exit(0);
                    }

                    default: {
                        System.out.println("Geçerli değer giriniz. ");
                        giris();
                    }
                }

            }else{
                System.out.println("Geçerli değer giriniz");
                giris();
            }
        }
    }
}