package com.kex;

public class Up extends Paint {


    public Up(int h,char znak){
        super(h,znak);
    }
    @Override
    public void choinka(){
        for(int i=1;i<=height;i++){
            printChar(' ',height-i);
            printChar(sign,(i*2)-1);
            System.out.println();
        }
    }
}
