package org.example.model;

public class Bread extends ProductForSale{
    private String brodo;



    Bread(String brodo) {
        this.brodo = brodo;
    }

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }
    public String getBrodo() {
        return brodo;
    }
    @Override
    public void showDetails() {
        System.out.println("Ürünün tipi: " + getType());
        System.out.println("Ürünün fiyatı: " +getPrice());
        System.out.println("Ürünün tanımı: " + getDescription());
        System.out.println("Ürüne özgü: " + getBrodo());
    }
}
