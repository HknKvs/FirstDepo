package kayıtUygulaması;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registiration {

        /*
 Bu uygulama kulanıcıların bir ArrayListe kayıt tarihini random alarak ekleyen
 ve sonrasında her ayın ilk 10 gününde kaydolanları şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.

Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
ay degiskeni icin 1 ila 12 arasinda random sayi uretin
gun degiskeni icin 1 ila 28 arasinda random sayi uretin
LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin

 Bunun için;
 1- Bir user class oluşturun fields: name , registerDate (LocalDate cinsinden)

 2- Registration isminde bir class oluşturun ve register isminde bir metod
 ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin

 3-Listing isminde bir class oluşturun ve printHappyUsers isminde bir metod ekleyerek
 ArrayListteki userlardan her ayın ilk 10 gününde kaydolanları yazdıran metodu oluşturun.

*/

    ArrayList <User> userList= new ArrayList<>();

    void register () {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim = scan.nextLine();
        User user = new User(isim,rndTarih());

        userList.add(user);



    }

    private LocalDate rndTarih() {

        LocalDate tarih =null;
        int rndGun=(int) Math.random()*(28-1+1)+1;
        int rndAy=(int) Math.random()*(12-1+1)+1;
        int rndYil=(int) Math.random()*(2022-2013+1)+2013;

        tarih=LocalDate.of(rndYil,rndAy,rndGun);
        return tarih;
    }


}
