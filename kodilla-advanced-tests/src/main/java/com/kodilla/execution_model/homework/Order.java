package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double orderValue;
    private LocalDate date;
    private String customerLogin;

    public Order(double orderValue, LocalDate date, String customerLogin) {
        this.orderValue = orderValue;
        this.date = date;
        this.customerLogin = customerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", date=" + date +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }
}
