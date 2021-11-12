import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleAreaTest {

    @Test
    void returnAreaOfRectangleForInteger(){
        assertEquals(15,Rectangle.calculateArea(3,5));
    }

   /* @Test
    void testRectangleAreaDouble(){
        assertEquals(1.5,Rectangle.calculateArea(3,0.5));
    }*/


}
