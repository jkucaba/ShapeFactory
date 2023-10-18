package org.jakubku;

public class Main {
    public static void main(String[] args) {
        Shape rect = ShapeFactory.getRectShape();
        rect.draw();
    }
}