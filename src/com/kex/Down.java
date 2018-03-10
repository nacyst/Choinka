package com.kex;

public class Down extends Paint {

    public  Down(int h,char znak){
           super(h,znak);
        }

    public void choinka(){

            for (int i = height;i>0;i--){
                printChar(' ',height-i);
                printChar(sign,(i*2)-1);
        System.out.println();
        }
    }


}
