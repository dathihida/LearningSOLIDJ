package com.DependencyInversionPrinciple;

public class payOnline implements PayMent {

    private Integer numberBook;
    private Double priceBook;
    private String statusPay;
    private String nameBank;

    public payOnline(Integer numberBook, Double priceBook, String statusPay, String nameBank) {
        this.numberBook = numberBook;
        this.priceBook = priceBook;
        this.statusPay = statusPay;
        this.nameBank = nameBank;
    }

    @Override
    public double payPrice() {
        return numberBook * priceBook;
    }

    @Override
    public String statusPay() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(statusPay);
        stringBuilder.append(nameBank);
        return stringBuilder.toString();
    }

}
