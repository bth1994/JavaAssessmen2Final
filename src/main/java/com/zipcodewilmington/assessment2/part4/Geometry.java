package com.zipcodewilmington.assessment2.part4;

class Geometry implements Circle, Rectangle{

    int height;
    int width;
    int radius;

    Geometry() {
        this.height = 0;
        this.width = 0;
        this.radius = 0;
    }

    Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    @Override
    public double getArea(int radius) {
        double pi = 3.14;
        return pi * Math.pow(radius, 2);
    }

    @Override
    public int getArea(int height, int width) {
        return height * width;
    }

}
