package com.DependencyInversionPrinciple;

public class ManagePay {
    private PayMent payMent;

    public void setPayMent(PayMent payMent) {
        this.payMent = payMent;
    }

    public String statusPayString() {
        return this.payMent.statusPay();
    }

    public double pricePay() {
        return this.payMent.payPrice();
    }
}
