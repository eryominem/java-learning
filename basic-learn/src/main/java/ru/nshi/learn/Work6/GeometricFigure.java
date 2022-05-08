package ru.nshi.learn.Work6;

public class GeometricFigure {
    protected int[] color = new int[3];
    protected double area;
    boolean RGB = false, HSB = false;

    public GeometricFigure() {
        this.area = -1;
    }

    public void setColorRGB(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.color[0] = red;
            this.color[1] = green;
            this.color[2] = blue;
            RGB = true;
            HSB = false;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setColorHSB(int hue, int saturation, int brightness){
        if((hue >= 0 && hue <= 360) & (saturation >= 0 && saturation <= 100) & (brightness >= 0 && brightness <= 100)) {
            this.color[0] = hue;
            this.color[1] = saturation;
            this.color[2] = brightness;
            RGB = false;
            HSB = true;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public double getArea(){
        return this.area;
    }

    public int[] getColor() {
        return color;
    }

    public String information(){
        return "Объект - " + this.getClass().getSimpleName() + "\nЦвет - " + this.color[0] + "|" + this.color[1] + "|" + this.color[2]
            + "\nПлощадь - " + this.area + "\n";
    }
}
