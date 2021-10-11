import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle TamGiacVuong = new Triangle(new Point(0,0), new Point(0,3), new Point(4,0) );
    @Test
    @DisplayName("Show perimeterTamGiacVuong equal to 12")
    void perimeterTamGiacVuong() {
        double actual = Triangle.perimeter(TamGiacVuong);
        double expected = 12;
        assertEquals(expected, actual);
    }

    Triangle TamGiacCan = new Triangle( new Point(0,0), new Point(0,1), new Point(1,0));
    @Test
    @DisplayName("Show perimeterTamGiacCan equal to 3.4")
    void perimeterTamGiacCan(){
    double actual = Math.round(Triangle.perimeter(TamGiacCan)*10.0)/10.0;
    double expected = 3.4;
    assertEquals(expected, actual);
    }
}