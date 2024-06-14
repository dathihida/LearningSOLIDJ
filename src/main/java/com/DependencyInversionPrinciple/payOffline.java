package com.DependencyInversionPrinciple;

public class payOffline implements PayMent {

    private Integer numberBook;
    private Double priceBook;
    private String statusPay;

    public payOffline(Integer numberBook, Double priceBook, String statusPay) {
        this.numberBook = numberBook;
        this.priceBook = priceBook;
        this.statusPay = statusPay;
    }

    @Override
    public double payPrice() {
        return numberBook * priceBook;
    }

    @Override
    public String statusPay() {
        return statusPay;
    }

}
