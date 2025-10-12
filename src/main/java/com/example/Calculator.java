package com.example;

import java.util.List;

public class Calculator {
    public final static String EMPTY = "empty";
    //para la clase article tengo que generar otro multuply para no cambiar el ya programado ya que descuento esta en double
    //y  cantidad en int
    public double multiplyGrossAmount(int a,double b){
        return (double)a*b;
    }
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Concatenate two strings
    public String concat(String a, String b) {
        if (b != null && a != null) {
            return a + b;
        }
        return EMPTY;
    }

    // New: add two values
    public double sum(double a, double b) {
        return a + b;
    }

    // New: apply a percentage discount
    public double discount(double amount, double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        return amount - (amount * percent / 100.0);
    }

    // New: calculate the total of a list of amounts
    public double calculateTotal(List<Double> amounts) {
        return amounts.stream().mapToDouble(Double::doubleValue).sum();
    }
}