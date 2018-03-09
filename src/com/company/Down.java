package com.company;

public class Down extends Paint {


    public void choinkaDown(){

            for (int i = height;i>0;i--){
                printChar(' ',height-i);
                printChar('X',(i*2)-1);
        System.out.println();
    }
    }


}
