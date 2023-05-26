package Java101Project;

import java.util.Scanner;

public class PrimeCheck {
    static int PrimeİsTrue(int sayi,int sinir){
        if(sayi<2){
            return 0;
        }
        if(sinir ==1){
            return 1;
        }
        if(sayi%sinir ==0){
            return 0;
        }
        return PrimeİsTrue( sayi, sinir-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asal olup olmadığını kontrol etmek istediğiniz sayıyı giriniz : ");
        int number = input.nextInt();

        int result = PrimeİsTrue(number,number/2);
        if (result==1) System.out.println(number +" Sayi ASALdır.");
        else System.out.println(number +" Sayi ASAL değildir.");



    }
}
