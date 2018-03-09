package com.company;

public class Left extends Paint{





    public void choinkaLeft(){
        for (int i = 1; i<=height*2;i++)
        {
            printChar(' ',i>height?(i-height):(height-i));
            printChar('X',i>height?((height*2)-i):(i));
            System.out.println();
        }
}




}
