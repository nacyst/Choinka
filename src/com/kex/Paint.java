package com.kex;

public abstract class Paint {
     static int height;
     static char sign;

    Paint(int h,char znak){
        height=h;
        sign=znak;
    }

    public abstract void choinka();


     void printChar(char znak,int count){
        for (int i=0;i<count;i++)
            System.out.print(znak);
    }

    public void setHeight(int height){
        this.height=height;
    }


}
