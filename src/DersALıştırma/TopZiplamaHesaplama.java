package DersALıştırma;

public class TopZiplamaHesaplama {


    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {

        int yukseklik = 2000;
        int ziplamaSayisi = 0;
        double azalma = 0.75;
        double aldigiYol = 0;

        do {
            yukseklik *= azalma;
            ziplamaSayisi++;
            aldigiYol+= yukseklik;

        } while (yukseklik > 1000);
        {

            System.out.println("Topun zıplama sayısı: " + ziplamaSayisi);
            System.out.println("Topun aldığpı yol: " + aldigiYol);

        }

    }
}
