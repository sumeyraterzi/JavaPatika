package Java101Project;

import java.util.Scanner;

public class UsluSayiRecursive {
    static int usHesapla(int taban,int us){
        if (us==0)
            return 1;
        else
            return taban* usHesapla(taban,us-1);
    }
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        int taban=okuyucu.nextInt();
        System.out.print("Üs değerini giriniz:");
        int us=okuyucu.nextInt();
        int sonuc= usHesapla(taban,us);
        System.out.println(sonuc);
    }
}
