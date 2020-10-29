package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    LocalDate current = LocalDate.now();
    LocalDate twoYearsAgo = current.minusYears(2);
    int max = 0;
    int min = 300;

    private List<Order> orders = new ArrayList<>();

    // dodanie nowego zamówienia,
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    // zwrócenie listy zamówień z zakresu dwóch dat,
    public Order between(LocalDate current, LocalDate twoYearsAgo) throws Exception {
     return   orders.stream().filter(el -> el.getDate().isBefore(current)).collect(Collectors.toList()).stream()
               .filter(e -> e.getDate().isAfter(twoYearsAgo)).findFirst().orElseThrow(Exception::new);
    }

    // pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia),
    public void getMaxValue() {
        int a = 0;
        if (a < min) {
            a = min;
        }
        return;
    }

    public void getMinValue() {
        int a = 0;
        if (a > max) {
            a = max;
        }
        return;

    }

    // zwrócenie liczby zamówień,
    public int getSize() {
        return this.orders.size();
    }

    // zsumowanie wartości wszystkich zamówień.
    public double sum() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getOrderValue();
        }
        return sum;
    }


}



