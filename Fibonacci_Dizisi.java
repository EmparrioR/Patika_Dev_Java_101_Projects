import java.util.Scanner;

public class Fibonacci_Dizisi {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kaç elemanlı fibonacci dizisi istiyorsunuz ?: ");
		int no = inp.nextInt();
		
		int toplam = 0,ilk = 0,ikinci = 1;
		
		System.out.print(ilk + " " + ikinci);
		
		for (int i = 1; i<=no ; i++){
			
			toplam = ilk + ikinci;
			ilk = ikinci;
			ikinci = toplam;
			
			System.out.print(" " + toplam);
			
		}
	}
}