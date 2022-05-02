package ru.nshi.learn.Work6;

public class Circle extends GeometricFigure {
    private final double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            this.area = Math.PI * Math.pow(radius, 2);
        }
        else {
            this.radius = -1;
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String information(){
        String str = super.information();
        return str + "Радиус - " + this.radius + "\n";
    }
}
