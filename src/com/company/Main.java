package com.company;

import java.util.Scanner;

public class Main {

    public static char choise;
    public static int height;
    public static Paint painter= new Paint();
    public static Scanner in= new Scanner(System.in);


    public static void main(String[] args) {

        showMenu();

    }




    public static void showMenu() {


        boolean createChoinka=true;

        while(createChoinka){

        System.out.println("Choose side of tree : ");
        System.out.println("l - left");
        System.out.println("r - right");
        System.out.println("u - up");
        System.out.println("d - down");
        System.out.println("q - quite");
        choise = in.nextLine().charAt(0);

        if (choise!='q') {
            System.out.println("Enter height of tree : ");
            height = Integer.parseInt(in.nextLine());
            painter.setHeight(height);

        }
        switch (choise) {
            case 'l':
                Left left = new Left();
                left.choinkaLeft();
                break;
            case 'r':
                Right right = new Right();
                right.choinkaRight();
                break;
            case 'u':
                Up up = new Up();
                up.choinkaUp();
                break;
            case 'd':
                Down down = new Down();
                down.choinkaDown();
                break;

            case 'q':
                createChoinka=false;
                break;
        }
        }

    }
}
