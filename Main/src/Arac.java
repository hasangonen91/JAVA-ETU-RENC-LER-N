import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Arac {
    
    private String uretici_firma;      //uretici firma
    private double motor_silindir_hacmi;  //motor silindir hacmi
    private static List<Araba> aracaraba = new ArrayList<>(); // araclarin tutuldugu list
    private static List<Kamyon> arackamyon = new ArrayList<>(); // araclarin tutuldugu list
    private static Scanner scanner = new Scanner(System.in);

    
    

    Arac() {
        
        Kamyon kamyon = new Kamyon();
        arackamyon.add(kamyon);
        
        Araba araba = new Araba();
        aracaraba.add(araba);

    }

    
    
  
    
    public String getUretici_firma() {
        return uretici_firma;
    }

    public void setUretici_firma(String uretici_firma) {
        this.uretici_firma = uretici_firma;
    }

    public double getMotor_silindir_hacmi() {
        return motor_silindir_hacmi;
    }

    public void setMotor_silindir_hacmi(double motor_silindir_hacmi) {
        this.motor_silindir_hacmi = motor_silindir_hacmi;
    }


    
    
    
    public void bilgi_metod(Kamyon kamyon) {

        Arac main = new Arac();
        
       // Kamyon kamyon = new Kamyon(2000, 1000);

       // Araba araba = new Araba(5,"dizel");

    }

    
    
    public void bilgi_metod(Araba araba) {

        Arac main = new Arac();
        
       // Kamyon kamyon = new Kamyon(2000, 1000);

       // Araba araba = new Araba(5,"dizel");

    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/hasan/Desktop/aracx/arac.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();

        while (satir != null) {
            System.out.println(satir);
            satir = reader.readLine();
        }

        Arac main = new Arac();

        
        Araba araba = new Araba(5, "dizel");
        main.bilgi_metod(araba);

        
        
        Kamyon kamyon = new Kamyon(2000, 1000);
        main.bilgi_metod(kamyon);

        
        
        
    }

}
