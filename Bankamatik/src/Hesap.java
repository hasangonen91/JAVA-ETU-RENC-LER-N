
import java.time.LocalDate;

public class Hesap {
    private LocalDate zaman;
    private String sifre;
    private int id;
    private double bakiye;
    private static int _id = 0;
	
	Hesap() {
		bakiye = 100.0;
		id = _id++;
		zaman = LocalDate.now();
	}
	Hesap(int id, double bakiye) {
		this.id = id;
		this.bakiye = bakiye;
		zaman = LocalDate.now();
	}
        
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getZaman() {
        return zaman;
    }

    public void setZaman(LocalDate zaman) {
        this.zaman = zaman;
          System.out.println(" SAAT/TARİH : " + getZaman());
    }
}
