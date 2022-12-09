package kayıtUygulaması;

import java.util.ArrayList;

public class Listing {

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

    void listele(ArrayList<User> userList) {

        if (!userList.isEmpty()) {

            for (User w : userList) {

                if (w.registerDate.getDayOfMonth() <= 10) {
                    System.out.println(w.name + " sanslı kullanıcısınız" + w.registerDate + " tarihinde kaydolu.");
                } else {
                    System.out.println(w.name + " şanslı kullanıcı değilsiniz." + w.registerDate + " tarihinde kaydoldu");
                }
            }
            {

            }

        } else {

            System.out.println("Lİste Boştur.");
        }


    }

}
