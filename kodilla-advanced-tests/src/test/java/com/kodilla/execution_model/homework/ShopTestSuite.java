package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order one = new Order(143.00, LocalDate.of(2020,10,2), "Mike Morus");
    Order two = new Order(254.00, LocalDate.of(2017,5,13), "John Snow");
    Order three = new Order(100.00, LocalDate.of(2019,6,25), "Jan Kowalski");
    List<Order> orders = Arrays.asList(one, two, three);

    //smiga
    @Test
    public void shouldAddOrders() {

        //When
        int numberOfOrders = shop.getSize();

        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldGetOrderFromTwoYears() throws Exception {
        System.out.println(LocalDate.now());
        //When
        Order result = shop.between(LocalDate.now(), LocalDate.now().minusYears(2));

        //Then
        assertEquals(LocalDate.of(2020,10,02), result.getDate());
        assertEquals("Mike Morus", result.getCustomerLogin());
    }

    @Test
    public void shouldGetMaxValue() {

        //When
        Order getMaxValue = orders
                .stream()
                .max(Comparator.comparing(Order::getOrderValue))
                .orElseThrow(NoSuchElementException::new);


        assertEquals(254.0, getMaxValue);
    }

    // ?
    @Test
    public void shouldGetMinValue() {

        //When
        Order getMinValue = orders
                .stream()
                .min(Comparator.comparing(Order::getOrderValue))
                .orElseThrow(NoSuchElementException::new);

        assertEquals(100, getMinValue);
    }

    //smiga
    @Test
    public void shouldGetSize() {

        //When
        shop.getSize();

        //then
        assertEquals(3, shop.getSize());
        System.out.println("The number of all orders is " + shop.getSize());
    }

    //smiga
    @Test
    public void shouldGetTotalValue() {

        //When
        shop.sum();

        //Then
        assertEquals(497.00, shop.sum());
        System.out.println("Total value of all orders is " + shop.sum());

    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}



