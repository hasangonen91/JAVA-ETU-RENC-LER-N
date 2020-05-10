/*
public class JavaApplication35 {

    public static void main(String[] args) {
        int sayi, Sorusec[] = new int[10];
       //Sorusec[0] =0;
        for (int i = 1; i < 10; i++) {
            sayi = (int) (Math.random() * 10);
            for (int j = 0; j <= i; j++) {
                if (Sorusec[j] == sayi) {
                    sayi = (int) (Math.random() * 10)+1;
                    j = 0;
                }
            }
            Sorusec[i] = sayi;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(Sorusec[j] + " ");
        }
    }
}*/
/*
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class JavaApplication35 {
    public static void main(String[] args) throws FileNotFoundException {
        int dogru = 0;
        int  dizi[] = new int[10];
        dizi[0] = 0;  
        String array[][] = new String[30][2];
        
        FileReader fileRead = new FileReader("C:/Users/hasan/Desktop/ulkeler.txt");
        
        BufferedReader bRead = new BufferedReader(fileRead);
        
        Random random = new Random();
        
        Scanner scanner = new Scanner(System.in);
        
        Scanner as = new Scanner(bRead);
        
         for (int i = 1; i < 10; i++) {
            int rand_int1 = random.nextInt(30); 
            for (int j = 0; j <= i; j++) {
                if (dizi[j] == rand_int1) {
                    rand_int1 =  random.nextInt(30); 
                    j = 0;
                }
            }
            dizi[i] = rand_int1;
         }
        for (int i = 0; i < 30; i++) {
            as.hasNextLine();
            String dizin = as.nextLine();
            int b = dizin.indexOf(" ");
            String turkey = dizin.substring(0, b);
            String ankara = dizin.substring(b, dizin.length());
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    array[i][j] = turkey;
                } else {
                    array[i][j] = ankara.substring(1,ankara.length());
                }
            }
        }
        as.close();
       
            for (int j = 0; j < 10; j++) { 
                String turkey = array[dizi[j]][0];
                String ankara = array[dizi[j]][1];
                System.out.println( turkey + " BASKENTI NERESIDIR : ");
                String cevap = scanner.next();
            if (cevap.equals(ankara)) {
                System.out.println("DOGRU CEVAP");
                dogru++;
            } else {
                System.out.println("YANLIS ");
                System.out.println("DOGRUSU: " + ankara);
            }
        }
        System.out.println("DOGRU SAYISI: " + dogru);
    }
*/

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
public class JavaApplication35 {
    public static void main(String[] args) throws FileNotFoundException {
        String dizi[][] = new String[30][2];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        FileReader file = new FileReader("C:/Users/hasan/Desktop/a.txt");
        BufferedReader bRead = new BufferedReader(file);
        int  dizisay[] = new int[10];
      Scanner add = new Scanner(bRead);    
      dizisay[0] = 0;  
        int dogru = 0 ;
     for (int i = 0; i < 10; i++) {
        int rand = random.nextInt(30); 
            for (int j = 0; j <= i; j++) {
                if (dizisay[j] == rand) {
                    rand = random.nextInt(30); 
                    j = 0;
                }
            }
            dizisay[i] = rand;
         }
        for (int i = 0; i < 30; i++) {
            add.hasNextLine();
            String satir = add.nextLine();
            int bosluk_index = satir.indexOf(" ");
            String ad = satir.substring(0, bosluk_index);
            String soyad = satir.substring(bosluk_index, satir.length());
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dizi[i][j] = ad;
                } else {
                    dizi[i][j] = soyad.substring(1, soyad.length());
                }
            }
        }
        add.close(); 
        for(int j = 0; j < 10; j++){ 
                String ad = dizi[dizisay[j]][0];
                String soyad = dizi[dizisay[j]][1];
            System.out.println(ad + " başkenti nersidir:");
                String cevap = scanner.next();
            if (cevap.toLowerCase().equals(soyad)){
                System.out.println("Doğru");
                dogru++;
            }else {
                System.out.println("Yanlış");
                System.out.println("Doğrusu " + soyad);
            }
        }
        System.out.println("Doğru sayısı: " + dogru);
    }
}


/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
public class JavaApplication39 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        FileReader file = new FileReader("C:/Users/hasan/Desktop/ulkeler1.txt");
        BufferedReader in = new BufferedReader(file);
        Scanner giris = new Scanner(in);
        String dizi[][] = new String[30][2];
        for (int i = 0; i < 30; i++) {
            giris.hasNextLine();
            String satir = giris.nextLine();
            int bosluk_index = satir.indexOf(" ");
            String ulke = satir.substring(0, bosluk_index);
            String baskent = satir.substring(bosluk_index, satir.length());
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dizi[i][j] = ulke;
                } else {
                    dizi[i][j] = baskent.substring(1, baskent.length());
                }}}
        giris.close();
        int dogruCevapSayisi = 0;
        int yanlısCevapSayisi = 0;
        int  Sorusec[] = new int[10];
       // Sorusec[0] = 0;//        
        for (int i = 1; i < 10; i++) {
        int    kacinciEleman = (int) (Math.random() * 29);
            for (int j = 0; j <= i; j++) {
                if (Sorusec[j] == kacinciEleman) {
                    kacinciEleman = (int) (Math.random() * 29);
                    j = 0;
                }
            }
            Sorusec[i] = kacinciEleman;
         }
        for (int j = 0; j < 10; j++) { 
         //   int kacinciEleman = random.nextInt(29);
                String ulke = dizi[Sorusec[j]][0];
                String baskent = dizi[Sorusec[j]][1];
            System.out.println(" " + ulke + " başkenti nersidir ? ");
                String kullanicicevap = input.next();
            if (kullanicicevap.toLowerCase().equals(baskent)) {
                System.out.println("Doğru cevap :)\n");
                dogruCevapSayisi++;
            } else {
                System.out.println("Yanlış cevap !");
                System.out.println("\nDoğru cevap : " + baskent);
                yanlısCevapSayisi++;
            }
        }
        System.out.println("\nDoğru cevap sayısı: " + dogruCevapSayisi);
        System.out.println("Yanlıs cevap sayısı: " + yanlısCevapSayisi);
        
          for(int q=0;q<Sorusec.length;q++){
            System.out.println(Sorusec[q]);
        }
    }
}
*/