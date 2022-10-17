import java.util.Scanner;

public class Mukemmel_Sayi_Bulma {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		int no = inp.nextInt();
		
		int result = 0,i;
		
		for ( i = 1; i<no; i++){
			if (no%i == 0){
				
				System.out.println(i);
				result += i;
			}	
		}
		
		
		if (result == no){
				System.out.println(no + " Mükemmel sayıdır");
				
			}else {
				System.out.println(no + " Mükemmel sayı değildir");
				
			}	
	}
}