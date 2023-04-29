package Java101Project;
import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu=new Scanner(System.in);
		System.out.print("1. SAYIYI GİRİNİZ: ");
		int n1=okuyucu.nextInt();
		System.out.print("2. SAYIYI GİRİNİZ: ");
		int n2=okuyucu.nextInt();
		int k=0, ebob=0, ekok=0;
		
		if (n1<n2) k=n1;
		else k=n2;
		// k küçük sayı
		
		for (int i=1; i<=k; i++) {
			if (n1%i==0 && n2%i==0)	{
			ebob=i;	
			}
		}
		System.out.println(n1+ " ve "+ n2+" sayılarının EBOB'u : "+ ebob);
		for (int i=1; i<=n1*n2; i++) {
			if (i%n1==0 && i%n2==0)	{
				ekok=i;	
				break;
			}


	}
		System.out.println(n1+ " ve "+ n2+" sayılarının EKOK'u : "+ ekok);
	}
}
