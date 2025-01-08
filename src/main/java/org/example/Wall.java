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
    public void setWidth(double sayi){
        if(sayi<0){
            width = 0;
            return;
        }
        sayi = width;
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
