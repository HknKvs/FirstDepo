package DersALıştırma;

public class HizHesaplama {


    public static void main(String[] args) {

        //Biraz fazla hızlı sürüyorsunuz ve bir polis memuru sizi durduruyor.
        // Sonucu hesaplamak için bir int hız değeri girini.
        // 0=bhız sınırları içerisinde, 1=hız sınırı dışında, 2=aşırı hızlı Hız 60 veya daha az ise sonuç 0'dır.
        // Hız 61 ile 80 arasındaysa sonuç 1'dir. Hız 81 veya daha fazla ise sonuç 2'dir.
        // hız her durumda 5 daha yüksek olabilir.

        int hiz = 4;
        int biletYok = 0;
        int kucukBilet = 1;
        int buyukBilet = 2;

        if (hiz<5 ) {
            System.out.println("Hız aralığı dışında. Değerlendirme yapılmamıştır.");
        } else if (hiz <= 60 ) {
            System.out.println("Hız sınırları içerisindesiniz.Yazılan ceza: " + biletYok);
        } else if (hiz <=80) {
            System.out.println("Hız sınırları dışındaısnız.Yazılan Ceza: " + kucukBilet);
        } else if (hiz >= 81) {
            System.out.println("Hız sınırlarıdışındasınız. Yazılan Ceza: " + buyukBilet);
        } else {
            System.out.println("Hatalı bilgi girişi");


        }
    }
}
