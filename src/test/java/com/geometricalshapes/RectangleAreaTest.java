package com.geometricalshapes;

import com.geometricalshapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleAreaTest {

    Rectangle rectangle = new Rectangle();

    @Test
    void returnAreaOfRectangleForInteger(){
        assertEquals(15,rectangle.area(3,5));
    }

   @Test
    void returnAreaOfRectangleForDouble(){
        assertEquals(1.5,rectangle.area(3,0.5));
    }

    @Test
    void returnPerimeterOfRectangle(){
        assertEquals(16, rectangle.perimeter(3, 5));
    }


}
