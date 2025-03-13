package org.example.model;

public class Coke extends ProductForSale{

    private String coko;

    Coke(String coko) {
        this.coko = coko;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public String getCoko() {
        return coko;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürünün tipi: " + getType());
        System.out.println("Ürünün fiyatı: " +getPrice());
        System.out.println("Ürünün tanımı: " + getDescription());
        System.out.println("Ürüne özgü: " + getCoko());
    }


}
