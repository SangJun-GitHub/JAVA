package com.sangjun.java_practice;
//Calendar and DecimalFormatting

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DATE;
import static org.junit.Assert.assertEquals;


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

//            System.out.println(expiryDateFormatter.format(expiryDate));
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

    public double getTax() { return tax; }

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

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 9, 5);

        Coffee latter = new Builder()
                .name("Latte")
                .price(4.5)
                .tax(0.11)
                .expiry(11)
                .producedDate(calendar.getTime())
                .build();

        System.out.println(latter);
        latter.printExpiry();
        assertEquals(latter.getPriceFormat(), "4.5");
        assertEquals(latter.getTaxFormat(), "11.00%");

        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 21);

        Coffee mocha = new Builder()
                .name("Mocha")
                .price(14.23)
                .tax(0.2322)
                .expiry(7)
                .producedDate(calendar.getTime())
                .build();
        assertEquals(mocha.getPriceFormat(), "14.23");
        assertEquals(mocha.getTaxFormat(), "23.22%");

        System.out.println(mocha);
        mocha.printExpiry();

        mocha.setPrice(13.0);
        assertEquals(mocha.getPriceFormat(),"13");
        mocha.setTax(0.55);
        assertEquals(mocha.getTaxFormat(),  "55.00%");

        System.out.println(mocha);

        mocha.setPrice(000004.5);
        assertEquals(mocha.getPriceFormat(), "4.5");
        mocha.setTax(0.13);
        assertEquals(mocha.getTaxFormat(), "13.00%");
        System.out.println(mocha);
    }


}

