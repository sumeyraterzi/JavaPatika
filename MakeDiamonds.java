package Java101Project;
import java.util.Scanner;
public class MakeDiamonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sayı giriniz: ");
		Scanner input = new Scanner (System.in);
		int n= input.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n; i>=1; i--) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
