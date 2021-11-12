package com.geometricalshapes;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleAreaTest {

    Rectangle rectangle = new Rectangle(3, 5);

    @Test
    void returnAreaOfRectangle(){

        assertEquals(15,rectangle.area());
    }

    @Test
    void returnPerimeterOfRectangle(){

        assertEquals(16, rectangle.perimeter());
    }


    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndPerimeter")
    void returnPerimeterOfRectangleUsingParameterizedTest(double length, double breadth, double expectedPerimeter){
    Rectangle rectangle = new Rectangle(length, breadth);
        assertEquals(expectedPerimeter, rectangle.perimeter());


    }

    private static Stream<Arguments> provideLengthBreadthAndPerimeter(){
        return Stream.of(
                Arguments.of(3, 5, 16),
                Arguments.of(2, 5, 14)
        );

    }


}
