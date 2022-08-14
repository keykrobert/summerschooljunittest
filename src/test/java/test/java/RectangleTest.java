package test.java;
import main.java.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void getArea(){
        main.java.Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals(12, rectangle.getArea());
    }
}
