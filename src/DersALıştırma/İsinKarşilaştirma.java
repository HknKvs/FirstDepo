package DersALıştırma;

import java.util.ArrayList;

public class İsinKarşilaştirma {

    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily}
     * Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {

        String [] array1 = {"John","Brad","Ange","Sofia","Emily"};
        String [] array2 = {"sofia","brad","grace","emily","hazel"};

        arraylerinOrtakElemanlariListe(array1,array2);

    }

    private static void arraylerinOrtakElemanlariListe(String[] array1, String[] array2) {

        ArrayList<String> arrList =new ArrayList<>();

        for (String each : array1) {

            for (String hic : array2) {

                if (each.equalsIgnoreCase(hic)){
                    arrList.add(hic);
                }
            }
        }
        System.out.println(arrList);
    }
}
