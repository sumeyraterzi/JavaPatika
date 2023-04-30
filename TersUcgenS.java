package Java101Project;
import java.util.Scanner;
public class TersUcgenS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu=new Scanner(System.in);
		System.out.print("Kaç katlı ters üçgen çizmek istediğinizi belirtiniz : ");
		int n= okuyucu.nextInt();
		
		for(int i=n; i>=1; i--) 
		{
			for(int j=0; j<n-i; j++) {
			System.out.print(" ");
		}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");
			}
			 
		System.out.println();
	}

}}