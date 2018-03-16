package com.kex;

public class Super extends Up {
    private Up upper;
    public Super(int h, char znak) {
        super(h, znak);
    }

    @Override
    public void choinka(){
        for (int i = 0;i<3;i++){
            super.choinka();
        }

        for (int i = 0; i <3 ; i++) {
            printChar(' ',height-2);
            printChar('|',3);
            System.out.println();
        }
    }
}
