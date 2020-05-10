
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Arac {
    
    private static Araba araba=null;
    private static Kamyon kamyon=null;
    private String uretici_firma;      //uretici firma
    private double motor_silindir_hacmi;  //motor silindir hacmi
    private static List<Araba> arabalar = new ArrayList<>(); // araclarin tutuldugu list
    private static List<Kamyon> kamyonlar = new ArrayList<>(); // araclarin tutuldugu list
    
    public Arac(String uretici_firma, double motor_silindir_hacmi) {
        this.uretici_firma = uretici_firma;
        this.motor_silindir_hacmi = motor_silindir_hacmi;
    }
    
    
    Arac(){
        
      /*  Kamyon kamyon = new Kamyon();
        kamyonlar.add(kamyon);
        
        
        Araba araba=new Araba();
        arabalar.add(araba);
        */
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
     
    
    
    public void main(Araba araba) {
        
//        Arac arac=new Arac();
        
    //    Araba araba = new Araba(5, "dizel");
        
      //  arac.main(araba);
      //  System.out.println(araba.toString());

        
       // Kamyon kamyon = new Kamyon(2000,3000);
       // System.out.println(kamyon.toString());
        
    }
     public void main(Kamyon kamyon) {
        
      //  Arac arac=new Arac();

       // Kamyon kamyon = new Kamyon(2000,3000);
       // System.out.println(kamyon.toString());
       
      // arac.main(kamyon);
        
    }

    
}
