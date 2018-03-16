package com.kex;

public class Left extends Paint{

    public Left(int h,char znak){
        super(h,znak);
    }


    @Override
    public void choinka(){
        for (int i = 1; i<=height*2;i++)
        {
            printChar(' ',i>height?(i-height):(height-i));
            printChar(sign,i>height?((height*2)-i):(i));
            System.out.println();
        }
    }
}
