package com.example;
import com.example.Calculator;
public class Article {
    private String name;
    private int cantidad;
    private double precio;
    private double descuento;
    private Calculator calculator=new Calculator();
    public Article(String name, int cantidad,double precio,double descuento){
        this.name=name;
        this.cantidad=cantidad;
        this.precio=precio;
        this.descuento=descuento;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;

    }
    public double getDescuento(){
        return descuento;
    }
    public void setDescuento(double descuento){
        this.descuento=descuento;
    }
    public double getGrossAmount(){
        return calculator.multiplyGrossAmount(cantidad, precio);
    }
    public double getDiscountedAmount(){
        double total=getGrossAmount();
        return calculator.discount(total, descuento);
    }
}
    