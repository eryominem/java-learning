package ru.nshi.learn.Work6;

public class Triangle extends GeometricFigure {
    private final double sides[] = new double[3];


    public Triangle(double[] sides) {
        if ((sides[0] + sides[1] < sides[2]) || (sides[0] + sides[2] < sides[1]) || (sides[1] + sides[2] < sides[0])){
            throw new IllegalArgumentException("Передано недопустимое значение сторон для треугольника!");
        }
        else{
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
            double P = (this.sides[0] + this.sides[1] + this.sides[2])/2;
            this.area = Math.pow(P * (P - this.sides[0]) * (P - this.sides[1]) * (P - this.sides[2]), 0.5);
        }
    }

    public double[] getSides(){
        return sides;
    }

    @Override
    public String information(){
        String str = super.information();
        return str + "Длины сторон " + this.sides[0] + ", " + this.sides[1] + ", " + this.sides[2] + "\n";
    }
}
