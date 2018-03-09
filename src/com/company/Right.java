package com.company;

public class  Right extends Paint {




    public void choinkaRight(){

        for(int i=1;i<height*2;i++){
            printChar('X',i>height?(height*2-i):i);
            System.out.println();
            }
        }

    }



