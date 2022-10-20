import java.util.Scanner;

public class Palindrom_Sayi{
	
	static boolean isPalindrom(int sayi){
	
	int temp = sayi,reverseNumber = 0,lastNumber;
	
	while(temp != 0){
		
		lastNumber = temp%10;
		// alttaki satır her seferinde elde edilen sayının 
		// 10 ile çarpılmasını ve sondaki sayının eklenmesini sağlar.
		reverseNumber = (reverseNumber * 10) + lastNumber;
		temp /= 10;
	}	
		if(sayi == reverseNumber)
			return true;
		else
			return false;
		
	
	
	}
		
	
	public static void main(String [] args){
		
		// int number = 2076;
		
		// Sayının son basamğı bulunarak başlanır
		// number % 10;
		
		
		System.out.println(isPalindrom(93939));
		
		
	}
}