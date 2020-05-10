
public class Kamyon {
  
    private double yuk_kapasitesi;  //double türünde yük kapasitesi
    private double cekme_kapasitesi;  //double türünde çekme kapasitesi

    
    
    public Kamyon(double yuk_kapasitesi, double cekme_kapasitesi) {
        this.yuk_kapasitesi = yuk_kapasitesi;
        this.cekme_kapasitesi = cekme_kapasitesi;
    }

    
    
    
    Kamyon(){
        yuk_kapasitesi=2000;
        cekme_kapasitesi=3000;
        
    }


    
    
    
    public double getYuk_kapasitesi() {
        return yuk_kapasitesi;
    }

    public void setYuk_kapasitesi(double yuk_kapasitesi) {
        this.yuk_kapasitesi = yuk_kapasitesi;
    }

    public double getCekme_kapasitesi() {
        return cekme_kapasitesi;
    }

    public void setCekme_kapasitesi(double cekme_kapasitesi) {
        this.cekme_kapasitesi = cekme_kapasitesi;
    }
    
    
    
    
    
    
    public void main(String[] args){
       
        Arac arac=new Arac();
        
        
        
    	//Kamyon banka = new Kamyon(20,2.0);
        
        
        

    }
}
