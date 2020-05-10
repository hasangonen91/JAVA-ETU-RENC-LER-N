import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Bankamatik {
	   private static Hesap h = null;
           private LocalDateTime dateCreated;
           private static List<Hesap> hesaplar = new ArrayList<>(); // Müşterilerin tutuldugu list
           private static Scanner input = new Scanner(System.in);
    Bankamatik() {
		for (int i = 0; i < 10; i++)
		{
			Hesap h = new Hesap();
			hesaplar.add(h);
		}
	}
    public void main_stream() {
        Date Zaman = new Date();
        System.out.println(Zaman.toString());
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(Zaman));
                    System.out.println("|------------------------------|");
                    System.out.println("|************91BANK************|");
                    System.out.println("|------------------------------|");                
                    System.out.println("|**********HOŞGELDİNİZ*********|");
                    System.out.println(" BİZİMLE GÜVENCE ALTINDASINIZ :) ");
                    System.out.println();
        while (true) {
            System.out.print("ID GIRINIZ (0-9) : ");
                        int id = input.nextInt(); 
                        if (id == -1){// -1 girerek program sonlanır
                                break;
	                }  
			for (Hesap x : hesaplar) {
				if (x.getId() == id) {
					h = x;
					hesap_islem_menu();
					break;
				}
			}
		}
    }
    private static void hesap_islem_menu() {
        while (true){
	            System.out.println("|------------------------------|");
                    System.out.println("|************91BANK************|");
                    System.out.println("|**********HOŞGELDİNİZ*********|");
                    System.out.println("|------------------------------|");
                    System.out.println(" BİZİMLE GÜVENCE ALTINDASINIZ :) ");
                    System.out.println();
                    System.out.println("|------------------------------|");
                    System.out.println("| İŞLEM SEÇİNİZ");
                    System.out.println("|******************************|");
                    System.out.println("| BAKİYENİZİ GÖRMEK İÇİN --> 1 |");
                    System.out.println("|------------------------------|");
                    System.out.println("| PARA ÇEKMEK İÇİN --> 2       |");
                    System.out.println("|------------------------------|");
                    System.out.println("| PARA YATIRMAK İÇİN --> 3     |");
                    System.out.println("|------------------------------|");
                    System.out.println("| ÇIKIŞ İÇİN --> 4             |");
                    System.out.println("|------------------------------|");
                    System.out.println("| PROGRAMI SONLANDIRMAK İÇİN |\n"
                                     + "| ÖNCE ÇIKIŞ YAPIN (4) DAHA  |\n"
                                     + "| SONRA  (-1) GİRİNİZ VEYA   |\n"
                                     + "| İD İSTENİLDİĞİ ZAMAN GİRİN |\n");
                    System.out.println("|------------------------------|");
                    System.out.print("SEÇİM : ");
                    int islem = input.nextInt();
			if (islem == 1){
                            System.out.println("|------------------------------|");
			    System.out.println("| BAKİYENİZ : " + h.getBakiye());
                            System.out.println("|------------------------------|");
			}else if (islem == 2){
                            System.out.println("|------------------------------------|");
			    System.out.println("| ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ : ");
				paracek(input.nextInt());
			}else if (islem == 3){
                             System.out.println("|--------------------------------------|");
			     System.out.println("| YATIRMAK İSTEDİGİNİZ TUTARI GİRİNİZ : ");
				parayatir(input.nextInt());
			}else if (islem == 4){
				toplampara();
				break;
	                }  
            }    
    }
    private static void paracek(int para) {
        if (para > 0 && h.getBakiye() > para) {
            //  h.setBakiye(h.getBakiye() - para);
            int x = (int) (h.getBakiye() - para);
            h.setBakiye(x);
            System.out.println("****YENİ BAKİYE : " + x);
            System.out.println(h.getZaman());
        } else {
            System.out.println("GEÇERLİ PARA ÇEKME TUTARI DEĞİL :(");
        }
    }
    private static void parayatir(int para) {
        if (para > 0) {
            int x = (int) (h.getBakiye() + para);
            h.setBakiye(x);
            System.out.println("****YENİ BAKİYE : " + x);
            System.out.println(h.getZaman());
        } else {
            System.out.println("GEÇERLİ PARA YATIRMA TUTARI DEĞİL :(");
        }
    }
    private static void toplampara() {
        double toplam = 0.0;
        for (Hesap x : hesaplar) {
            toplam += x.getBakiye();
        }
        System.out.println("TARİH : "+ h.getZaman());
        System.out.println("**** BANKADAKİ TOPLAM PARA MİKTARI : " + toplam);
    }
}
