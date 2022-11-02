package com.haktanozgur.primeNumber;

public class primeNumber {
	
	public static void main(String[] args) {
		 
		for(int sayi = 2; sayi <= 100; sayi++) { // Bu döngüde ekrana çıktı olarak vereceğimiz asal sayı değerlerinin aralığını belirledim

			/* Tanımladığım değişken, döngü içerisinde asal sayı kontrolü yapacak
			 * Döngü bittikten sonra ise true değerine göre asal sayıları ekrana yazdıracak*/
			boolean check = true; 

			for (int i = 2; i<sayi; i++)  { // Bu döngüde ise bu sayıların kendisinden küçük sayılara bölünebilirliğini kontrol ettik.
			    if (sayi % i == 0) {
					check = false;
				    break;
				}
			}
				if(check == true) {   
					System.out.print(sayi + ",");
				}
		
		}
		
	}

}
