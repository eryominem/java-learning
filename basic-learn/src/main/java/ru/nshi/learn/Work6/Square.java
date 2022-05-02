package ru.nshi.learn.Work6;

public class Square extends Rectangle {

    public Square(double[] sides){
        super(sides);
        if(!(sides[0]==sides[1] && sides[1] == sides[2] && sides[2] == sides[3])) {
            throw new IllegalArgumentException();
        }
        this.area = this.sides[0] * this.sides[0];
    }


}
