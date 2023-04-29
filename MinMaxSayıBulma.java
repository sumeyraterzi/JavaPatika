package Java101Project;
import java.util.Scanner;
public class MinMaxSayıBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
	 *  bu sayıları ekrana yazan programı yazın.

		Senaryo
		Kaç tane sayı gireceksiniz: 4
		1. Sayıyı giriniz: 16
		2. Sayıyı giriniz: -22
		3. Sayıyı giriniz: -15
		4. Sayıyı giriniz: 100
		En büyük sayı: 100
		En küçük sayı: -22 */
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE,k=0;
		Scanner input=new Scanner (System.in);
		System.out.print("Kaç tane sayı gireceksiniz : ");
		int adet=input.nextInt();
		
		for(int i=1; i<=adet; i++) {
			System.out.print(i+" . Sayıyı Giriniz : ");
			int number= input.nextInt();
			if (number < min)
				min=number;
			if (number > max)
				max=number;
					
		}
				
System.out.println("En küçük sayı = "+ min);
System.out.println("En büyük sayı = "+ max);
	}

}
