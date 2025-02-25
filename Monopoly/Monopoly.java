package Monopoly;
/*
Christian Ortiz-Blanco
Java Program

This is a program that plays a monopoly game in the terminal from 2-6 players
 */

import java.util.*;
public class Monopoly {

    
    public static Integer TurnState(Player player,Integer pos){
        int STATE;
        STATE=Game.Play(pos);
        return STATE;
    }
    /* 
    public static void CONDITIONS(Player player, Integer pos){                  Conditions for each tile
        if(pos==3||18||34){ //Community chest 

        }
        if(pos==8||23||37){ //CHANCE 

        }
        if(pos==39||5){ //LUX tax and Income tax

        } 
    }
        */

    //################################################ MAIN #########################################
    public static void main(String args[]){

        //################# DEBUG ##################

        //Board.Tile(Board.GO());

        



        

        Scanner scanner=new Scanner(System.in);
        Integer Roll; 
        Integer CTILE=Board.GO();
        Integer NTILE=Board.GO();
        //Integer Player1STATE=CTILE;
        boolean GO=true;
        boolean Juego1=true;
        boolean Juego2=true;
        //boolean Juego3=true;
        //boolean Juego4=true;
      
        boolean Player1NOTBankrupt=true;
        boolean Player2NOTBankrupt=true;
        //boolean Player3NOTBankrupt=true;
        //boolean Player4NOTBankrupt=true;
        //Integer Player2STATE=1;
        //Integer Player3STATE=1;
        //Integer Player4STATE=1;
        

        Player Player1 = new Player("Player1",CTILE);
        Player Player2 = new Player("Player2",CTILE);
        //Player Player3 = new Player();
        //Player Player4 = new Player();


        //set player start tile
        Player1.SetTILE(CTILE); 
        Player2.SetTILE(CTILE);

//############################ TILE 5 CURRENT TILE TO WORK ON######################

    while(GO){
        //################################################################################################# PLAYER 1
        while(Juego1&&Player1NOTBankrupt){                             
            CTILE=Player1.getTILE();
            System.out.println("PLAYER 1 Roll Dice? 1(Yes) or 0(No) ");
            Roll = scanner.nextInt();
                //if (scanner.hasNextInt()) {
                //Roll = scan.nextInt();                                    
                //scanner.nextLine(); //Consume input
                if (Roll == 1) {
                    NTILE=TurnState(Player1,CTILE);
                    System.out.println("DEBUG1:"+CTILE);         
                    System.out.println("DEBUG2:"+NTILE);  // DEBUG WHAT IS THE NEXT TILE 
                    Player1.SetTILE(NTILE);
                    Juego1=false;

                } else if (Roll == 0) {
                    System.out.println("Thanks for playing:");
                    Juego1=false;
                }
                     else {
                System.out.println("Invalid input. Please enter 1 or 0.");
                scanner.next(); // Consume the invalid input
            }
            //Juego=false;
        }
        Juego1=true;
        //################################################################################################# PLAYER 2
        while(Juego2&&Player2NOTBankrupt){
            CTILE=Player2.getTILE();
            System.out.println("PLAYER 2 Roll Dice? 1(Yes) or 0(No) ");
            Roll = scanner.nextInt();
                //if (scanner.hasNextInt()) {
                //Roll = scan.nextInt();                                    
                //scanner.nextLine(); //Consume input
                if (Roll == 1) {
                    NTILE=TurnState(Player2,CTILE);
                    System.out.println("DEBUG1:"+CTILE);         
                    System.out.println("DEBUG2:"+NTILE);  // DEBUG WHAT IS THE NEXT TILE 
                    Player2.SetTILE(NTILE);
                    Juego2=false;

                } else if (Roll == 0) {
                    System.out.println("Thanks for playing:");
                    Juego2=false;
                }
                     else {
                System.out.println("Invalid input. Please enter 1 or 0.");
                scanner.next(); // Consume the invalid input
            }
            //Juego=false;
        }
        Juego2=true;

        /* 
        while(Player3NOTBankrupt){
            
        }
        while(Player4NOTBankrupt){
            
        }
        */

    }
        scanner.close();

        
    }        
}

