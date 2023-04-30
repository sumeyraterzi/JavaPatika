package Java101Project;
import java.util.Scanner;
public class MukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
		toplamı kendisine eşit olan sayıya mükemmel sayı denir. */
		Scanner input= new Scanner(System.in);
		System.out.print("Mükemmel Sayı mı Değil mi Sorgulamak İstediğiniz Sayıyı Giriniz : ");
		int sayi = input.nextInt();
		int toplam=0;
		for (int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				System.out.println(i);
				toplam+=i;
			}
		}
		if (toplam==sayi) {
			System.out.print(sayi+ " Mükemmel sayıdır.");
		}else System.out.print(sayi+ " Mükemmel sayı değildir.");
		
		
	}

}
