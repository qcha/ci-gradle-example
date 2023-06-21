package ru.aarexer.figures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    @DisplayName("Circle constructor must throw IllegalArgumentException on radius less or equal to zero")
    public void constructor_Throws_OnRadiusLessOrEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    @DisplayName("Circle constructor must not throw on radius greater than zero")
    public void constructor_DoesNotThrow_OnRadiusGreaterThanZero() {
        var radius = 2;
        var circle = new Circle(radius);
    }

    @Test
    @DisplayName("Circle radius getter must return radius that was passed in constructor")
    public void radiusGetter_ReturnsValuePassedInConstructor() {
        var radius = 2;
        var circle = new Circle(radius);

        assertEquals(radius, circle.getRadius(), 9);
    }

    @Test
    @DisplayName("Circle getPerimeter must return perimeter calculated using this formula: 2 * PI * Radius")
    public void getPerimeter_ReturnsPerimeter_CalculatedUsingCirclePerimeter_ForCircleWithGivenRadius() {
        var radius = 2;
        var circle = new Circle(radius);

        var expectedPerimeter = 2 * Math.PI * radius;
        var actualPerimeter = circle.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 9);
    }

    @Test
    @DisplayName("Circle getArea must return area calculated using this formula: PI * Radius * Radius")
    public void getArea_ReturnsArea_CalculatedUsingCircleAreaFormula_ForCircleWithGivenRadius() {
        var radius = 2;
        var circle = new Circle(radius);

        var expectedArea = Math.PI * radius * radius;
        var actualArea = circle.getArea();
        assertEquals(expectedArea, actualArea, 9);
    }
}