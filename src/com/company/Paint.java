package com.company;

public class Paint {
    public void printChar(char znak,int count){
        for (int i=0;i<count;i++)
            System.out.print(znak);
    }

     protected static int height;

    public void setHeight(int height){
        this.height=height;
    }


}
