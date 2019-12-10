package espoir.com.domain;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class CalculationRate {
    @Id
    private String id;
    private double rate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CalculationRate{" +
                "id='" + id + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private double rate;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildRate(double rate){
            this.rate=rate;
            return this;
        }
        public CalculationRate build(){
        CalculationRate calculationRate=new CalculationRate();
        calculationRate.id=this.id;
        calculationRate.rate=this.rate;
        return calculationRate;
        }
    }
}
