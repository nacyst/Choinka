package com.company;

public class Up extends Paint {


    Up(int h,char znak){
        super(h,znak);
    }

    public void choinka(){
        for(int i=1;i<=height;i++){
            printChar(' ',height-i);
            printChar(sign,(i*2)-1);
            System.out.println();
        }
    }
}
