package com.example;
import java.util.List;

import com.example.Article; 
public class Order {
    private String id;
    private List <Article> articulos;
    public Order(String id,List<Article>articulos){
        this.id=id;
        this.articulos=articulos;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public List<Article> getArticulos(){
        return articulos;
    }
    public void setArticulos(List <Article> articulos){
        this.articulos=articulos;
    }
    public double getGrossTotal(){
        double total=0;
        for(Article i:articulos){
            total+=i.getGrossAmount();
        }
        return  total;
    }
    public double getDiscountedTotal(){
        double descuentoTotal=0;
        for(Article i:articulos){
            descuentoTotal+=i.getDiscountedAmount();
        }
        return descuentoTotal;
    }
    @Override
    public String toString() {
        return "Order ID: " + id + "\n" + "Artículos:\n" + articulos;
    }
}
