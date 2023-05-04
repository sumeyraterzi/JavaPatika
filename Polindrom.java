package Java101Project;
import java.util.Scanner;
public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Bir sayı girin: ");
		        int sayi = scanner.nextInt();
		        if (isPolindrom(sayi)) {
		            System.out.println(sayi + " bir polindromik sayıdır.");
		        } else {
		            System.out.println(sayi + " bir polindromik sayı değildir.");
		        }
		    }

		    public static boolean isPolindrom(int sayi) {
		        int tersi = 0, kalan = 0, gecici = sayi;
		        while (gecici != 0) {
		            kalan = gecici % 10;
		            tersi = tersi * 10 + kalan;
		            gecici = gecici / 10;
		        }
		        return (tersi == sayi);
		    }
	

	
}
