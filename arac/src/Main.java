
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       
        Arac arac = new Arac();

        Araba araba = new Araba(5, "dizel");
        arac.main(araba);
        //  System.out.println(araba.toString());

        Kamyon kamyon = new Kamyon(2000, 3000);
        arac.main(kamyon);
        // System.out.println(kamyon.toString());

        File file = new File("C:/Users/hasan/Desktop/aracx/arac.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();
        while (satir != null) {
            System.out.println(satir);
            satir = reader.readLine();
        }

        File fil = new File("C:/Users/hasan/Desktop/aracx/arac.txt");
        if (!fil.exists()) {
            fil.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(fil, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(araba.getYakit_türü());
        bWriter.write(araba.getYolcu_kapasitesi());

        bWriter.write((int) kamyon.getCekme_kapasitesi());
        bWriter.write((int) kamyon.getYuk_kapasitesi());

        bWriter.close();

        
        
    }
}
