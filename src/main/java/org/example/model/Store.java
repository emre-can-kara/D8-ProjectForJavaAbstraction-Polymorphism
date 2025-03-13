package org.example.model;

public class Store {
    public static void main(String[] args) {

            ProductForSale[] products = {new Chocolate("Siyahtır", 10, "Güzeldir"), new Coke("Siyahtır ama asitlidir"), new Bread("Karbonhidrat")};
            listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale i : products) {
            i.showDetails();
        }
    }
}