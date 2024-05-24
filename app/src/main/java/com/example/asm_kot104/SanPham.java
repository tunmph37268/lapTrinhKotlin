package com.example.asm_kot104;

public class SanPham {
    private Integer image;
    private  String name;
    private Double price;
    private Integer quantity;

    public SanPham() {
    }

    public SanPham(Integer image, String name, Double price, Integer quantity) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
