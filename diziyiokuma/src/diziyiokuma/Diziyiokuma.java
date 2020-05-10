package diziyiokuma;

import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Diziyiokuma {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        FileReader file = new FileReader("C:/Users/hasan/Desktop/ulkeler1.txt");
        BufferedReader in = new BufferedReader(file);
        int k = 0;
        Scanner giris = new Scanner(in);
        String dizi[][] = new String[30][2];
        int kacinciEleman = random.nextInt(dizi.length);

        for (int i = 0; i < 30; i++) {
            giris.hasNextLine();
            String satir = giris.nextLine();
            int bosluk_index = satir.indexOf("");
            String ulke = satir.substring(0, bosluk_index);
            String baskent = satir.substring(bosluk_index, satir.length());
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dizi[i][j] = ulke;
                } else {
                    dizi[i][j] = baskent;
                }
            }
        }
        while (giris.hasNext()) {
            String isim = giris.next();
            String soyad = giris.next();

            System.out.println(" " + dizi[kacinciEleman][0] + " başkenti nersidir ? ");
            String cevap = input.next();
            if (cevap.equals(soyad)) {
                System.out.println("Doğru cevap :)");
            } else {
                System.out.println("Yanlıs cevap  :(");
                System.out.println(isim + "  başkenti  " + soyad + "  dir");
            }
        }
        giris.close();
    }
}