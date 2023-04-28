package Java101Project;
import java.util.Scanner;
public class HarmonikSayilariBulanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen n değerini giriniz : ");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		double result =0.0;
		for (int i=1; i<=n; i++) {
		result += (1.0/i);
		}
				
		System.out.println(result);
	}

}
