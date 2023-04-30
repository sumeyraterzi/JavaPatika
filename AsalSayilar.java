package Java101Project;
import java.util.Scanner;
public class AsalSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
		for(int i=2; i<100; i++) {
			boolean isPrime =true;
			for (int j=2; j<=i/2; j++) {
				if (i%j==0) {
					isPrime= false;
					break;
				}}
				if (isPrime) {
					System.out.print(i + " ");
				}
			
		}
		
	}

}
