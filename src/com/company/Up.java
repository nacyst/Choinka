package com.company;

public class Up extends Paint {

    public void choinkaUp(){
        for(int i=1;i<=height;i++){
            printChar(' ',height-i);
            printChar('X',(i*2)-1);
            System.out.println();
        }


    }

}
