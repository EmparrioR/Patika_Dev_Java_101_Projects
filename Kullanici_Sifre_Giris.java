import java.util.Scanner;

public class Kullanici_Sifre_Giris{
    public static void main(String[] args) {
        
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("Alperen") && password.equals("ipragaz")){
            System.out.print("Hoşgeldiniz");
			
        } else {
            System.out.println("Şifrenizi veya kullanıcı adınızı yanlış girdiniz !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? : ");
            String secim = input.nextLine();

			switch (secim) {
				case "evet": System.out.print("Yeni şifrenizi giriniz: ");
                             String yeni_sifre = input.nextLine();
							 
					switch (yeni_sifre) {
						case "ipragaz": System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz ! ");
										break;
						default: 	System.out.println("Şifre oluşturuldu");
									break;	
					}
									
				default:     System.out.println(" ");					
			}									
        }  

    }
}