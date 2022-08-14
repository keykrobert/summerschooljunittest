package main.java;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.getLength() * this.getWidth();
    }

    public int getPerimetr() {
        return this.getLength() * 2 + this.getWidth() * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(this.getLength() * this.getLength() + this.getWidth() * this.getWidth());
    }

    public boolean isQuadrat() {
        return this.getLength() == this.getWidth();
    }
}
