package Java101Project;

import java.util.Scanner;

public class BasamakToplamı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int top=0, x;
		System.out.print("Lütfen sayı giriniz : ");
		Scanner input= new Scanner(System.in);
		int sayi = input.nextInt();
	
		while (sayi!=0) {
		
		x = sayi%10;
		top+= x;
		sayi/=10;
	}
		
	System.out.println(top);
	}

}
