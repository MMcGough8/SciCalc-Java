package com.zipcodewilmington.scientificcalculator;

public class CoreFeatures{
    
    private double displayValue;

    private boolean errorState;

    public CoreFeatures()
    {
        this.displayValue = 0.0;
        this.errorState=false;
    }
    public double getDisplayValue() 
    {
        return this.displayValue;
    }
    public boolean inErrorState() 
    {
        return this.errorState;
    }
    public void setDisplay (double value) 
    {
        if (checkError()) return;
        this.displayValue=value;
    }
    public void clearDisplay () 
    { 
        this.displayValue=0.0;
        this.errorState=false;
       
           for (int i = 0; i < 50; ++i)
            {
            System.out.println();
            }
        System.out.println("Cleared");
    }
    public void add(double number) 
    {
        if (checkError()) return;
        this.displayValue += number;
    }
    public void subtract (double number) 
    {
        if (checkError()) return;
        this.displayValue -= number;
    }
    public void multiply (double number) 
    {
        if (checkError()) return;
        this.displayValue *= number;
    }
    public void divide(double number) 
    {
        if (checkError()) return;
        if(number ==0) {
            setError();
            return;
     }
        this.displayValue/=number;
    }
    public void square () {
        if (checkError()) return;
        this.displayValue=this.displayValue*this.displayValue;
    }
    public void squareRoot() {
        if (checkError()) return;
        if (this.displayValue<0) {
            setError();
            return;
        }
        this.displayValue=Math.sqrt((this.displayValue));
    } 
    public void exponentiation(double exponent) {
        if (checkError()) return;
        this.displayValue=Math.pow(this.displayValue, exponent);
    }
    public void inverse() {
        if (checkError()) return;
        if (this.displayValue==0) {
            setError();
            return;
        }
        this.displayValue=1/this.displayValue;
    }
    public void inverseSign() {
        if (checkError()) return;
        this.displayValue=-this.displayValue;
    
    }
    private void setError() {
        this.errorState=true; 
    }
    private boolean checkError() {
        if (this.errorState) {
            System.out.println("ERR");
            return true;
        }
        return false;
    }
    public double percentage(double percentOf) {
        if (checkError()) return this.displayValue;
        this.displayValue = (this.displayValue / 100) * percentOf;
        return this.displayValue;
    }

}