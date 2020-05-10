
public class Araba {
 
private int yolcu_kapasitesi;   //yolcu kapasitesi   
private String yakit_türü;  //yakıt türü

    public Araba(int yolcu_kapasitesi, String yakit_türü) {
        this.yolcu_kapasitesi = yolcu_kapasitesi;
        this.yakit_türü = yakit_türü;
    }
    
    
    

    Araba() {
        
        yolcu_kapasitesi=5;
        yakit_türü="dizel";
        
    }

    
    
    
    public int getYolcu_kapasitesi() {
        return yolcu_kapasitesi;
    }

    public void setYolcu_kapasitesi(int yolcu_kapasitesi) {
        this.yolcu_kapasitesi = yolcu_kapasitesi;
    }

    public String getYakit_türü() {
        return yakit_türü;
    }

    public void setYakit_türü(String yakit_türü) {
        this.yakit_türü = yakit_türü;
    }
 
    
    
    
      public void main(String[] args){
        
        Arac main = new Arac();
        
        Araba araba = new Araba(5, "dizel");
        
        main.bilgi_metod(araba);
          System.out.println("");
        

    }

}
