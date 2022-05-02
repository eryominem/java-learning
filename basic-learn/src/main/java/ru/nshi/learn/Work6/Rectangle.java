package ru.nshi.learn.Work6;
import java.util.Arrays;
public class Rectangle extends GeometricFigure {
    protected final double[] sides = new double[4];

    public Rectangle(double[] sides){
        if((sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[3] > 0) &&
            (sides[0] == sides[2] && sides[1] == sides[3])) {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
            this.sides[3] = sides[3];
            for(int i = 1; i < sides.length; i++){
                if(this.sides[0] != this.sides[i] || i == 3){
                    this.area = this.sides[0] * this.sides[i];
                }
            }
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /*public Rectangle(double[] sides) {
        Arrays.sort(sides);
        if ((sides[0] != sides[1]) || (sides[2] != sides[3]) || (sides[0] == sides[3]) || (sides[1] == sides[2])) {
            throw new IllegalArgumentException();
        }
        else {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
            this.sides[3] = sides[3];
            /*for(int i = 1; i < sides.length; i++) {
                if (this.sides[0] != this.sides[i] || i == 3) {
                    this.area = this.sides[0] * this.sides[i];
                }
            }
            this.area = this.sides[0] * this.sides[3];
        }
    }*/

    public double[] getSides(){
        return sides;
    }

    @Override
    public String information(){
        String str = super.information();
        return str + "Длины сторон " + this.sides[0] + ", " + this.sides[1] + ", " + this.sides[2] + ", " + this.sides[3] + "\n";
    }
}
