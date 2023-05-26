package Java101Project;

import java.util.Scanner;

public class DeseneGoreMetod {


    static int desen(int sayi) {
        if (sayi <= 0) {
            System.out.print(sayi + " ");
            sayi = sayi - 5;
            return sayi;
        }

        System.out.print(sayi + " ");
        sayi = sayi - 5;
        return desen(sayi);
    }

    public static void main(String[] args) {
        Scanner okuyucu= new Scanner(System.in);
        System.out.print( "Bir sayı giriniz : ");
        int a= okuyucu.nextInt();
        desen(a);
       /* Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
        N Sayısı : 16
    Çıktısı : 16 11 6 1 -4 1 6 11 16
        */

    }
}
