package com.sangjun.java_practice;

import java.text.DecimalFormat;

public class SimpleNumberFormatter {
    private static DecimalFormat decimalFormat = new DecimalFormat("###,###,###.###");

    public String format(double number) {
        String result = decimalFormat.format(number);
        return result;
    }

    public void setFormatter(DecimalFormat other) {
        decimalFormat = other;
    }

    public DecimalFormat getFormatter() {
        return decimalFormat;
    }
}
