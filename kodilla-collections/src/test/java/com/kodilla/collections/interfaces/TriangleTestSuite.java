package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {
    @Test
    public void shouldGetAreaIfDimensionsAreZero() {
        //Given
        Triangle triangle = new Triangle(0, 0, 0);
        //When
        //Then
        assertEquals(0, triangle.getArea());
    }

    @Test
    public void shouldGetAreaIfDimensionsAreBelowZero() {
        //Given
        Triangle triangle = new Triangle(-1, -1, -1);
        //When
        //Then
        assertEquals(0.5, triangle.getArea());
    }

    @Test
    public void shouldGetAreaIfDimAAboveZero() {
        //Given
        Triangle triangle = new Triangle(1, 1, 1);
        //When
        //Then
        assertEquals(0.5, triangle.getArea());
    }

    @Test
    public void shouldGetPerimeterIfDimAEqualsZero() {
        //Given
        Triangle triangle = new Triangle(0, 0, 0);
        //When
        //Then
        assertEquals(0, triangle.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimABelowZero() {
        //Given
        Triangle triangle = new Triangle(-1, -1, -1);
        //When
        //Then
        assertEquals(-3, triangle.getPerimeter());
    }

    @Test
    public void shouldGetPerimeterIfDimAAboveZero() {
        //Given
        Triangle triangle = new Triangle(1, 1, 1);
        //When
        //Then
        assertEquals(3, triangle.getPerimeter());
    }

    @Test
    public void shouldEqualsHashCodeAndToStrongWork() {
        //Given
        Triangle triangle = new Triangle(1, 1, 1);
        //When
        //Then
        triangle.equals(1);
        triangle.hashCode();
        triangle.toString();
    }

}