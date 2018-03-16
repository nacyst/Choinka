package com.company.menu;

import java.util.Scanner;
import com.kex.*;
import org.jetbrains.annotations.Nullable;

public class Menu implements MainMenu{
    private static char choiceDir;
    private static char sign;
    private static int height;
    private static Paint painter;
    private static Scanner in= new Scanner(System.in);
    private boolean createChoinka=true;




   public void showMenu() {
        while(createChoinka){
            Choices choice = null;
            menu();
            choiceDir = in.nextLine().charAt(0);
            choice=chooseEnum();
            if (choice==null){
                continue;
            }
            enterData();
            createTree(choice);
        }
    }




    private   void enterData(){
        System.out.println(ENTER_HEIGHT);

        try{
            height = Integer.parseInt(in.nextLine());
            checkInt();
            System.out.println(ENTER_SIGN);
            sign = in.nextLine().charAt(0);
        }catch (NumberFormatException error){
            System.out.println(ENTER_HIGHER_ZERO);
        }
    }

    private void checkInt() throws NumberFormatException{
       if (height<=0)
           throw new  NumberFormatException();
    }



    private void menu(){
        System.out.println(CHOICE);
        System.out.println(LEFT_DIRECTION);
        System.out.println(RIGHT_DIRECTION);
        System.out.println(UP_DIRECTION);
        System.out.println(DOWN_DIRECTION);
        System.out.println(SUPER);
        System.out.println(QUITE);
    }



    @Nullable
    private  Choices chooseEnum(){
        switch (choiceDir){
            case 'l':
                return Choices.Left;
            case 'r':
                return Choices.Right;

            case 'd':
                return Choices.Down;

            case 'u':
                return Choices.Up;

            case 's':
                return Choices.Super;

            case 'q':
                createChoinka=false;
                return null;

            default:
                System.out.println(TRY_AGAIN);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;

        }

    }

    private void createTree(Choices choice) {

        switch (choice) {
            case Left:
                painter = new Left(height,sign);
                painter.choinka();
                break;

            case Right:

                painter = new Right(height,sign);
                painter.choinka();
                break;

            case Up:

                painter = new Up(height,sign);
                painter.choinka();
                break;

            case Down:

                painter = new Down(height,sign);
                painter.choinka();
                break;

            case Super:

            painter =new Super(height,sign);
                painter.choinka();
                break;


        }

    }

}
