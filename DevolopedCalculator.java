package Java101Project;

import java.util.Scanner;



public class DevolopedCalculator {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int a,b,result ;
        System.out.print("İlk sayıyı giriniz :");
        a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        b = scan.nextInt();

        result = a-b;

        System.out.println("Sonuç : " + result);
    }
    static void divided(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Bölen : ");
        int a= scan.nextInt();
        System.out.print("Bölüm : ");
        int b= scan.nextInt();

        double result=1;
        if(b==0){
            System.out.println("İkini sayı 0 olamaz !");
        }else {
            result = a / b;
            System.out.println("Bölme işleminizin sonucu : "+ result);
        }
    }

    static void times (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Çarpma işlemini bitirmek için 1 e basınız !");
        System.out.println("Lütfen sayı giriniz : ");
        int number, result=1, i=1;
        while(true){
            System.out.println(i++ + ".sayı :");
            number=scan.nextInt();

            if(number ==1)
                break;
            if(number==0){
                result=0;
                break;}
            result*=number;

        } System.out.println("Çarpma işleminizin sonucu : "+ result);
    }

    static void power(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayı : ");
        int a= scan.nextInt();
        System.out.print("Üssü : ");
        int b= scan.nextInt();
        int result=1;
        for (int i=1; i<=b; i++){
            result *=a;
        }
        System.out.println("SONUÇ : "+ result);

    }
    static void faktoriyel(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayı : ");
        int a= scan.nextInt();
        int result=1;
        for (int i=1; i<=a; i++){
            result*=i;
        }System.out.println("SONUÇ : "+ result);
    }
    static void mode(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayı : ");
        int a= scan.nextInt();
        System.out.print("Mod : ");
        int b= scan.nextInt();
        int result =1;
        result = a%b;
        System.out.println(a+" mod "+b+" : "+ result);
    }
    static void rectangle(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Uzun Kenar : ");
        int a= scan.nextInt();
        System.out.print("Kısa Kenar : ");
        int b= scan.nextInt();
        int alan=1, cevre=0;
        alan=a*b;
        cevre=2*(a+b);

        System.out.println("Çevre ="+ cevre);
        System.out.println("Alan ="+ alan);
    }


    public static void main(String[] args) {

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do{
            Scanner scan = new Scanner(System.in);
            System.out.println(menu);
            System.out.print("Bir İşlem seçiniz : ");
            select=scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Güle Güle ŞEKERİM !");
                    break;
                default:
                    System.out.println("Yanlış bir seçim yaptınız !");
            }


        }while(select!=0);
    }
}
