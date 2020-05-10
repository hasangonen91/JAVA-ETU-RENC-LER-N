
import java.util.Arrays;


public class test {
     public static  int[] aresa(String unli) {
        String[] harfler = {"a", "e", "i", "o", "u"};
        int[] seri = new int[5];
        System.out.println("KARAKTER UZUNLUGU: "+unli.length());
        for (int i = 0; i < unli.length(); i++) {
             String karakter = Character.toString(unli.charAt(i));
             for (int j=0;j<harfler.length;j++){
                 if (harfler[j].equals(karakter.toLowerCase())){
                     seri[j]++;
                 }  
             // return seri;  
             }        
        }
        for (int adet = 0; adet < 5; adet++) {
            System.out.println(harfler[adet] + " " + seri[adet] + " tane");
        } 
       // for (int element: seri) {
         //   System.out.print(element+"");
       // }
       
       System.out.println("Dizi Elemanları : " + Arrays.toString(seri));
         return seri;
    }
}
