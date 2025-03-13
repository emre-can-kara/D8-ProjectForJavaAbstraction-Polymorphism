package org.example.model;

public class Chocolate extends ProductForSale{

    private String choko;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

   public Chocolate(String choko) {
        this.choko = choko;
    }

    public String getChoko() {
        return choko;
    }

    public void setChoko(String choko) {
        this.choko = choko;
    }


    @Override
    public void showDetails() {
        System.out.println("Ürünün tipi: " + getType());
        System.out.println("Ürünün fiyatı: " +getPrice());
        System.out.println("Ürünün tanımı: " + getDescription());
        System.out.println("Ürüne özgü: " + getChoko());
    }
}
