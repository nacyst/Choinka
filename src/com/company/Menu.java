package com.company;
import java.util.Scanner;
import com.kex.*;

public class Menu {
    private static char choiceDir;
    private static char sign;
    private static int height;
    private static Paint painter;
    private static Scanner in= new Scanner(System.in);
    private boolean createChoinka=true;




      void showMenu() {
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
        System.out.println("Enter height of tree : ");

        try{
            height = Integer.parseInt(in.nextLine());
            System.out.println("Enter a char you would like : ");
            sign = in.nextLine().charAt(0);
        }catch (NumberFormatException error){
            System.out.println("You entered the char please try again");
        }
    }



    private void menu(){
        System.out.println("Choose side of tree : ");
        System.out.println("l - left");
        System.out.println("r - right");
        System.out.println("u - up");
        System.out.println("d - down");
        System.out.println("q - quite");
    }



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

              case 'q':
                  createChoinka=false;
                  return null;

              default:
                  System.out.println("\nTry again\n");
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


        }

    }

}
