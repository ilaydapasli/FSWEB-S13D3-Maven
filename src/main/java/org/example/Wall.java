package org.example;
public class Wall {
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Setter for height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate area
    public double getArea() {
        return this.width * this.height;
    }
}