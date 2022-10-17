import java.util.Scanner;

public class Burc_Hesaplama {
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Hangi ay doğdunuz: ");
		int ay = inp.nextInt();
		
		System.out.print("Hangi gün doğdunuz: ");
		int gun = inp.nextInt();
		
		if(ay >= 1 && ay <= 12){
			if(gun >= 1 &&  gun <= 30){
				
		
		if (ay == 12){
			if (gun >= 22) {
				System.out.println("Oğlak burcusunuz");
			}else {
				System.out.print("Yay burcusunuz");
			}
		}else if (ay == 1){
				if (gun <= 21){
					System.out.print("Oğlak burcusunuz");
				}else {
					System.out.print("Kova burcusunuz");
				}
		}else if (ay == 2){
				if (gun <= 19){
					System.out.print("Kova burcusunuz");
				}else {
					System.out.print("Balık burcusunuz");
				}
		}else if (ay == 3){
				if (gun <= 20){
					System.out.print("Balık burcusunuz");
				}else {
					System.out.print("Koç burcusunuz");
				}
		}else if (ay == 4) {
				if (gun <= 20){
					System.out.print("Koç burcusunuz");
				}else {
					System.out.print("Boğa burcusunuz");
				}
		}else if (ay == 5) {
				if (gun <= 21){
					System.out.print("Boğa burcusunuz");
				}else {
					System.out.print("İkizler burcusunuz");
				}
		}else if (ay == 6) {
				if (gun <= 22){
					System.out.print("İkizler burcusunuz");
				}else {
					System.out.print("Yengeç burcusunuz");
				}
		}else if (ay == 7) {
				if (gun <= 22){
					System.out.print("Yengeç burcusunuz");
				}else {
					System.out.print("Aslan burcusunuz");
				}
		}else if (ay == 8) {
				if (gun <= 22){
					System.out.print("Aslan burcusunuz");
				}else {
					System.out.print("Başak burcusunuz");
				}
		}else if (ay == 9) {
				if (gun <= 22){
					System.out.print("Başak burcusunuz");
				}else {
					System.out.print("Terazi burcusunuz");
				}
		}else if (ay == 10) {
				if (gun <= 22){
					System.out.print("Terazi burcusunuz");
				}else {
					System.out.print("Akrep burcusunuz");
				}
		}else if (ay == 11 ) {
				if (gun <= 20){
					System.out.print("Akrep burcusunuz");
				}else {
					System.out.print("Yay burcusunuz");
				}
		}
			}else {
				System.out.println("Geçersiz giriş !");
			}
		}else {
			System.out.println("Geçersiz giriş !");
		
		}
					
					
					
					
					
					
					
					
		
	}
}