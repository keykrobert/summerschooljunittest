package main.java;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest extends TestCase {
    @Test
    public void getArea(){
        Rectangle rectangle = new Rectangle(3,5);
        Assert.assertEquals(12, rectangle.getArea());
    }

    public void testGetPerimetr() {
        Rectangle rectangle = new Rectangle(10,10);
        Assert.assertEquals(20, rectangle.getPerimetr());

    }
    public void testGetArea(){
        Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals(12, rectangle.getArea());
    }

    public void testGetDiagonal() {
        Rectangle rectangle = new Rectangle(2,8);
        Assert.assertEquals(12, rectangle.getDiagonal(), 0.01);
    }

    public void testIsQuadrat() {
        Rectangle rectangle = new Rectangle(4,4);
        Assert.assertEquals(true, rectangle.isQuadrat());
    }
    public void testGetLength() {
        Rectangle rectangle = new Rectangle(4,4);
        Assert.assertTrue(rectangle.getLength() > 0);
    }
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(4,5);
        Assert.assertTrue(rectangle.getWidth() > 0);
    }
}