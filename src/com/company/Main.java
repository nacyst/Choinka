package com.company;

import java.util.Scanner;

public class Main {

    private static char choise;
    private static char sign;
    private static int height;
    private static Paint painter;
    private static Scanner in= new Scanner(System.in);


    public static void main(String[] args) {

        showMenu();

    }




    private static void showMenu() {


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
            System.out.println("Enter a char you would like : ");
            sign = in.nextLine().charAt(0);
        }
        switch (choise) {
            case 'l':
                painter = new Left(height,sign);
                painter.choinka();
                break;
            case 'r':

                painter = new Right(height,sign);
                painter.choinka();

                break;
            case 'u':

                painter = new Up(height,sign);
                painter.choinka();

                break;
            case 'd':

                painter = new Down(height,sign);
                painter.choinka();

                break;

            case 'q':
                createChoinka=false;
                break;
            }
        }

    }
}
