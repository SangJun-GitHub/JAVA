package com.sangjun.java_practice;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DATE;

//mutable class
public class Coffee {
    private final String name;
    private double price;
    private double tax;
    private final int expiry;
    private final Date producedDate;

    private static final DecimalFormat priceFormatter;
    private static final DecimalFormat taxFormatter;
    private static final SimpleDateFormat expiryDateFormatter;

    static {
        priceFormatter = new DecimalFormat("###,###,###.##");
        taxFormatter = new DecimalFormat("00.00%");
        expiryDateFormatter = new SimpleDateFormat("yyyy-DD-mm hh:MM:ss");
    }

    public Coffee(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.tax = builder.tax;
        this.expiry = builder.expiry;
        this.producedDate = builder.producedDate;
    }

    public String getPriceFormat() {
        return priceFormatter.format(price);

    }

    public String getTaxFormat() {
        return taxFormatter.format(tax);
    }

    private static Calendar calendar = Calendar.getInstance();

    public void printExpiry() {
        //       Calendar calendar = Calendar.getInstance();
        calendar.setTime(getProducedDate());
        calendar.add(DATE, expiry);
        Date expiryDate = calendar.getTime();
        if(expiryDate.compareTo(new Date()) < 0){
            System.out.println("you can't drink");
            System.out.println(expiryDateFormatter.format(expiryDate));
        }else{
            System.out.println("you can drink");
        }
//        LocalDate localDate = LocalDate.of(producedDate.getYear(), producedDate.getMonth(), producedDate.getDate());
//        localDate.plusDays(expiry);
//        if(localDate.isBefore(LocalDate.now())) {
//
//        }else {
//
//        }
    }

    public static class Builder {
        private  double price;
        private  double tax;
        private String name;
        private int expiry;
        private Date producedDate = new Date();

        public Builder name(String name) {
            this.name = name; return this;
        }
        public Builder tax(double tax) {
            this.tax = tax; return this;
        }
        public Builder price(double price) {
            this.price = price; return this;
        }
        public Builder expiry(int expiry) {
            this.expiry = expiry; return this;
        }
        public Builder producedDate(Date date) {
            if(date == null) {
                this.producedDate = new Date();
            } else {
                this.producedDate = date;
            }
            return this;
        }
        public Coffee build() {
            return new Coffee(this);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public int getExpiry() {
        return expiry;
    }

    public Date getProducedDate() {
        return producedDate;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", expiry=" + expiry +
                ", producedDate=" + producedDate +
                '}';
    }
}
