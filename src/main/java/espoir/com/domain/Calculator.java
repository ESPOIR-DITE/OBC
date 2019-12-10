package espoir.com.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.IdentityHashMap;

@Entity
public class Calculator {
    @Id
    private String name;
    private double mounthAmountPay;
    private double amountBorrowed;
    private double mounthPay;
    private double yearPay;
    private double weekPay;
    private double dayPay;

    private Calculator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMounthAmountPay() {
        return mounthAmountPay;
    }

    public void setMounthAmountPay(double mounthAmountPay) {
        this.mounthAmountPay = mounthAmountPay;
    }

    public double getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(double amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    public double getMounthPay() {
        return mounthPay;
    }

    public void setMounthPay(double mounthPay) {
        this.mounthPay = mounthPay;
    }

    public double getYearPay() {
        return yearPay;
    }

    public void setYearPay(double yearPay) {
        this.yearPay = yearPay;
    }

    public double getWeekPay() {
        return weekPay;
    }

    public void setWeekPay(double weekPay) {
        this.weekPay = weekPay;
    }

    public double getDayPay() {
        return dayPay;
    }

    public void setDayPay(double dayPay) {
        this.dayPay = dayPay;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "name='" + name + '\'' +
                ", mounthAmountPay=" + mounthAmountPay +
                ", amountBorrowed=" + amountBorrowed +
                ", mounthPay=" + mounthPay +
                ", yearPay=" + yearPay +
                ", weekPay=" + weekPay +
                ", dayPay=" + dayPay +
                '}';
    }
    public static class Builder{
        private String name;
        private double mounthAmountPay;
        private double amountBorrowed;
        private double mounthPay;
        private double yearPay;
        private double weekPay;
        private double dayPay;

        public Builder(String name){
            this.name=name;
        }
        public Builder buildMAP(double mounthAmountPay){
            this.mounthAmountPay=mounthAmountPay;
            return this;
        }
        public Builder buildAB(double amountBorrowed){
            this.amountBorrowed=amountBorrowed;
            return this;
        }
        public Builder buildMP(double mounthPay){
            this.mounthPay=mounthPay;
            return this;
        }
        public Builder buildYP(double yearPay){
            this.yearPay=yearPay;
            return this;
        }
        public Builder buildWP(double weekPay){
            this.weekPay=weekPay;
            return this;
        }
        public Builder buildDP(double dayPay){
            this.dayPay=dayPay;
            return this;
        }
        public Calculator build(){
            Calculator calculator=new Calculator();
            calculator.amountBorrowed=this.amountBorrowed;
            calculator.dayPay=this.dayPay;
            calculator.mounthAmountPay=this.mounthAmountPay;
            calculator.name=this.name;
            calculator.weekPay=this.weekPay;
            calculator.yearPay=this.yearPay;
            calculator.mounthPay=this.mounthPay;
            return calculator;
        }

    }

}
