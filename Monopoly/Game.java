package Monopoly;

import java.util.*;

public class Game extends Monopoly{
    
    
    static Integer ROLL;
    static Integer NEXTILE;
    static Integer CURRENTILE;
    
    public static Integer Play(int Tile){
        ArrayList<String> TILE=new ArrayList<>(100);
        boolean GAME=true;
        //System.out.println("Play? 1 or 0");
        //Scanner scan = new Scanner(System.in);
        //int Input = scan.nextInt();
        

        //TILE=Board.Tile(CURRENTILE);
        //Print.PrintCorner(TILE);
        //int ROLL=10;    //(Dice.Dice1()+Dice.Dice2());
        //System.out.println("You rolled two dice for a: " + ROLL);
        //int NEXTILE=CURRENTILE+ROLL;
        //CURRENTILE = NEXTILE;
        //System.out.println("DEBUG "+ CURRENTILE);


        //While Loop For ONE TURN PER PLAYER PUT INTO METHOD
        while(GAME) {
                //GO TILE
            if (Tile==1){
                CURRENTILE=Board.GO();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=10;                        //(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                
                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
                return CURRENTILE;
            }
            //JUST VISITING TILE
            if (Tile==11){
                CURRENTILE=Board.JustVisiting();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YouLandedon DEBUG:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
        //FREE PARKING TILE
            if (Tile==21){
                CURRENTILE=Board.FREEPARKING();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YouLandedon DEBUG:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
           
        //GO TO JAIL TILE
            if (Tile==31){
                CURRENTILE=Board.GoToJail();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YouLandedon DEBUG:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
        

        //Current tile reset after 40 if statement
            if (CURRENTILE>=40){
                int remain= CURRENTILE%40;
                CURRENTILE=remain;
                GAME=false;
            }
        }
        //Play(Tile);
        //scan.close();
        return CURRENTILE;
    }
}
