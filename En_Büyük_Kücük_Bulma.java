import java.util.Scanner;

public class En_Büyük_Kücük_Bulma {
	public static void main(String [] args){
		
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kaç tane sayı gireceksiniz ?: ");
		int no = inp.nextInt();
		
		int maks = 0,min = 0;
		
		for (int i=1; i<=no; i++)
        {
            System.out.print(i+". sayiyi giriniz: ");
            int sayi = inp.nextInt();
            
            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            
            if (sayi>maks)
                maks=sayi;
            
            if (sayi<min)
                min=sayi;
        }
		
			System.out.println("En Büyük Sayı: " + maks);
			System.out.println("En Küçük Sayı: " + min);
	}
}