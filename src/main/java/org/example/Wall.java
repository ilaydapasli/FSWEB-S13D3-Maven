package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    }
    public void setHeight(double sayi2){
        if(sayi2<0){
            height = 0;
            return;
        }
        sayi2 = height;
    }

    public double getArea(){

        return width * height;
    }


}
