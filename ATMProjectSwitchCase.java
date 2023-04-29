package Java101Project;
import java.util.Scanner;
public class ATMProjectSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int right=3;
				int bakiye=1500;
				int toplam=bakiye;
				int select=0;
				
				while (right>0){
				System.out.println("Lütfen Bankamızda İşlem Yapmak İçin Bilgilerinizi Giriniz. ");
				Scanner okuyucu=new Scanner(System.in);
				System.out.print("Kullanıcı Adı: ");
				String userName=okuyucu.nextLine();
				System.out.print("Şifre: ");
				String password=okuyucu.nextLine();
				if (userName.equals("SUMEYRA")  && password.equals("1234")) {
					System.out.println("Sisteme giriş yaptınız.");	
					do {					
					right=0;
					System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ .\n"+"1-BAKİYE SORGULAMA\n"+"2-PARA ÇEKME\n"+"3-PARA YATIRMA\n"+"4-ÇIKIŞ" );
					select= okuyucu.nextInt();
					
				
						switch (select) { 
						
						case 1:
							System.out.println("BAKİYENİZ: "+ toplam);
							break;
						case 2:
							System.out.println("Ne kadar para çekeceğinizi belirtiniz : ");
							int paraC=okuyucu.nextInt();
							if (toplam >=paraC) {
							toplam-=paraC;
							System.out.println("BAKİYENİZ: "+ toplam);
							}
							else {System.out.println("BAKİYENİZ YETERSİZDİR ! ");							
							}
							break;
						case 3:
							System.out.println("Ne kadar para yatıracağınızı belirtiniz : ");
							int paraY=okuyucu.nextInt();
							toplam+=paraY;
							System.out.println("BAKİYENİZ: "+ toplam);
							break;
						case 4:
							System.out.println("Bankamıza tekrar bekleriz. ");
							break;
						default:
						System.out.println("Yanlış bir tuşlama yaptınız !");	
				
						}}
				while (select !=4);
				}else { 
					right --;
					System.out.println("Lütfen tekrar deneyiniz."+right+" hakkınız kaldı.");
					
					
				}
				
				}

				
			}

				}

	


