package com.sangjun.java_practice;
//DecimalFormatting

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class SimpleNumberFormatter {
    private static DecimalFormat decimalFormat = new DecimalFormat("###,###,###.###");



    public static void setDecimalFormat(DecimalFormat decimalFormat) {
        SimpleNumberFormatter.decimalFormat = decimalFormat;
    }

    public String format(double number) {
        String result = decimalFormat.format(number);
        return result;
    }


    public DecimalFormat getFormatter() {
        return decimalFormat;
    }

    @Test
    public void test1(){
        double test = 123456.789;
        System.out.println(format(test));
        assertTrue(test == 123456.789);


        DecimalFormat newFormat = new DecimalFormat("000,000,000.000");
        setDecimalFormat(newFormat);
        System.out.println(format(test));
        assertEquals(format(test), "000,123,456.789");
        assertNotEquals(test, "000,123,456.789");

    }
}
