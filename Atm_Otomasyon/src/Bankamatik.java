import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bankamatik {
	private static Hesap h = null;
    private static List<Hesap> hesaplar = new ArrayList<>(); // Müşterilerin tutuldugu list
    private static Scanner scanner = new Scanner(System.in);
	
	Bankamatik(){
		for (int i = 0; i < 10; i++)
		{
			Hesap h = new Hesap();
			hesaplar.add(h);
		}
	}
	
	public void main_stream() {
		while(true) {
			System.out.print("Id giriniz (0-9) : ");
			int id = scanner.nextInt();
			
			for (Hesap x : hesaplar) {
				// Çıkış istenirse burada kontrol edilmeli nextInt e bakılmalı -1 se çıkılır
				if (x.getId() == id) {
					h = x;
					hesap_islem_menu();
					break;
				}
			}
		}
    }
    private static void hesap_islem_menu() {
		
		while (true)
		{
			System.out.println();
			System.out.println("|*****91BANK*****|");
			System.out.println("|------------------------------|");
			System.out.println("İŞLEM SEÇİNİZ");
			System.out.println("|**********|");       
			System.out.println("BAKİYENİZİ GÖRMEK İÇİN --> 1"); 
			System.out.println("|------------------------------|");
			System.out.println("PARA ÇEKMEK İÇİN --> 2");
			System.out.println("|------------------------------|");
			System.out.println("PARA YATIRMAK İÇİN --> 3");
			System.out.println("|------------------------------|");
			System.out.println("ÇIKIŞ İÇİN --> 4");
			System.out.println("|------------------------------|");
			
			System.out.print("SEÇİM : ");
			int secim = scanner.nextInt();
			
			if (secim == 1)
			{
				System.out.println("\nBAKİYENİZ : " + h.getBakiye());
			}
			else if (secim == 2)
			{
				System.out.print("\nÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ : ");
				para_cek(scanner.nextInt());
			}
			else if (secim == 3)
			{
				System.out.print("\nYATIRMAK İSTEDİGİNİZ TUTARI GİRİNİZ : ");
				para_yatir(scanner.nextInt());
			}
			else if (secim == 4)
			{
				toplam_para();
				break;
			} 
		}
    }
	private static void para_cek(int para) {
		if (para > 0 && h.getBakiye() > para) {
			h.setBakiye(h.getBakiye() - para);
		} else {
			System.out.print("\nGEÇERLİ PARA ÇEKME TUTARI DEĞİL");
		}
	}
	
	private static void para_yatir(int para) {
		if (para > 0 ) {
			h.setBakiye(h.getBakiye() + para);
		} else {
			System.out.print("\nGEÇERLİ PARA YATIRMA TUTARI DEĞİL");
		}
	}
	
	private static void toplam_para() {
		double toplam = 0.0;
		
		for (Hesap x : hesaplar) {
			toplam += x.getBakiye();
		}
		
		System.out.print("\nBANKADAKİ TOPLAM PARA MİKTARI : " + toplam);}
                }