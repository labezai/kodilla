package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {

    @Test
    public void shouldGetAreaIfDimAEqualsZero() {
        //Given
        Square square = new Square(0);
        //When
        //Then
        assertEquals(0, square.getArea());
    }

    @Test
    public void shouldGetAreaIfDimABelowZero() {
        //Given
        Square square = new Square(-1);
        //When
        //Then
        assertEquals(1, square.getArea());
    }

    @Test
    public void shouldGetAreaIfDimAAboveZero() {
        //Given
        Square square = new Square(1);
        //When
        //Then
        assertEquals(1, square.getArea());
    }

    @Test
    public void shouldGetPerimeterIfDimAEqualsZero() {
        //Given
        Square square = new Square(0);
        //When
        //Then
        assertEquals(0, square.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimABelowZero() {
        //Given
        Square square = new Square(-1);
        //When
        //Then
        assertEquals(-4, square.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimAAboveZero() {
        //Given
        Square square = new Square(1);
        //When
        //Then
        assertEquals(4, square.getPerimeter());
    }

    @Test
    public void shouldEqualsHashCodeAndToStrongWork() {
        //Given
        Square square = new Square(1);
        //When
        //Then
        square.equals(1);
        square.hashCode();
        square.toString();
    }

}