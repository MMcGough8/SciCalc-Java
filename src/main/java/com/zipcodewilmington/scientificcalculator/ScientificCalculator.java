package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {
    private static final String[] MODES = {"DEC", "HEX", "OCT", "BIN"};

    Double memvalue;
    String displayMode;
    int modeIndex;
    boolean isDegrees;


    public ScientificCalculator() {
        this.memvalue = 0.0;
        this.displayMode = "DEC";
        this.modeIndex = 0;
        this.isDegrees = false;
    }

    public void switchDisplayMode() {
        modeIndex = (modeIndex + 1) % MODES.length;
        displayMode = MODES[modeIndex];
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void switchDisplayMode(String s){
        String upper = s.toUpperCase();
        for (int i = 0; i < MODES.length; i++) {
            if (MODES[i].equals(upper)) {
                modeIndex = i;
                displayMode = MODES[i];
                return;
            }
        }
        throw new IllegalArgumentException("Err: " + s);
    }
    public String formatForDisplay(double value) {
    int intValue = (int) value;
    switch (displayMode) {
        case "HEX":
            return Integer.toHexString(intValue).toUpperCase();
        case "OCT":
            return Integer.toOctalString(intValue);
        case "BIN":
            return Integer.toBinaryString(intValue);
        case "DEC":
        default:
            return String.valueOf(value);
    }
}
    
    public Double memoryFunctions(Double currentValue, String command) {
        switch (command) {
            case "M+":
                memvalue += currentValue;
                return memvalue;
            case "M-":
                memvalue -= currentValue;
                return memvalue;
            case "MR":
                return memvalue;
            case "MC":
                memvalue = 0.0;
                return null;
            default:
                throw new IllegalArgumentException("Err: " + command);
        }
    }
    public Double mrc(){
        return memvalue;
    }

    public double sine(Double x) {
        if (isDegrees) {
            x = Math.toRadians(x);
        }
        return Math.sin(x);
    }
    public double cosine(Double x) {
        if (isDegrees) {
            x = Math.toRadians(x);
        }
        return Math.cos(x);
    }
    public double tangent(Double x) {
        if (isDegrees) {
            x = Math.toRadians(x);
        }
        return Math.tan(x);
    }   
    public double inverseSine(Double x) {
        double result = Math.asin(x);
        if (isDegrees) {
            result = Math.toDegrees(result);
        }
        return result;
    }
    public double inverseCosine(Double x) {
        double result = Math.acos(x);
        if (isDegrees) {
            result = Math.toDegrees(result);
        }
        return result;
    }
    public double inverseTangent(Double x) {
        double result = Math.atan(x);
        if (isDegrees) {
            result = Math.toDegrees(result);
        }
        return result;
    }
    public void switchUnitsMode() {
        isDegrees = !isDegrees;
    }
    public void switchUnitsMode(String mode) {
    String upper = mode.toUpperCase();
    if (upper.equals("DEGREES") || upper.equals("DEGREE")) {
        this.isDegrees = true;
    } else if (upper.equals("RADIANS") || upper.equals("RADIAN")) {
        this.isDegrees = false;
    } else {
        throw new IllegalArgumentException("Invalid units mode: " + mode);
    }
}
    public void setUnitsMode(boolean isDegrees) {
        this.isDegrees = isDegrees;
    }
    public boolean isInDegreesMode() {
        return isDegrees;
    }
    public double logarithm(Double x) {
        return Math.log10(x);
    }
    public double inverseLogarithm(Double x) {
        return Math.pow(10, x);
    }
    public double naturalLogarithm(Double x) {
        return Math.log(x);
    }
    public double inverseNaturalLogarithm(Double x) {
        return Math.exp(x);
    }
    public double factorial(Double x) {
    if (x < 0) {
        throw new IllegalArgumentException("Err: Factorial undefined for negative numbers");
    }
    if (x != Math.floor(x)) {
        throw new IllegalArgumentException("Err: Factorial only works on integers");
    }
    if (x > 170) {
        throw new IllegalArgumentException("Err: Factorial result too large");
    }
    int n = x.intValue();
    double result = 1.0;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
public double decimalToPercentage(Double x) {
    return x * 100;
}
}
