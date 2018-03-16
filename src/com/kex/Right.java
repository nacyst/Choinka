package com.kex;

public class  Right extends Paint {

    public Right(int h,char znak){
        super(h,znak);
    }

    @Override
    public void choinka(){

        for(int i=1;i<height*2;i++){
            printChar(sign,i>height?(height*2-i):i);
            System.out.println();
            }
        }
    }



