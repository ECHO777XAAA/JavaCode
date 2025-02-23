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
        TURN(STATE,player.getTILE());
        return STATE;
    }

    public static void TURN(int STATE,int playerposition){
        Scanner scan=new Scanner(System.in);
         
        //System.out.println("Started ON GO");
        Integer Input=STATE;                              //SCANNER DEBUG
        
        boolean loop=true;
        
        while(loop){
            if (Input==1){
                System.out.println("DEBUG:" + STATE);
                if ((STATE == 1)||(STATE == 11)||(STATE == 21)||(STATE == 31)){
                    ArrayList<String>  tempTile=Board.Tile(playerposition);                       //FIX LOGIC
                        System.out.println("You Landed on:");
                        System.out.println();
                        Print.PrintCorner(tempTile);     
                        loop=false;                   
                    }
                    else{
                        ArrayList<String>  tempTile=Board.Tile(playerposition);
                        System.out.println("You Landed on:");
                        System.out.println();
                        Print.PrintEDGE(tempTile);
                        loop=false;
                    }
            } 
            else if (Input==0){
                System.out.println("Exit?: 1 or 0:");
                Input=scan.nextInt();
                if(Input==1){
                    loop=false;
                }
                else{
                    continue;
                }
            }
            else{
                loop=false;
            }
        }
        loop=false;
        scan.close();
    }
    
    //################################################ MAIN #########################################
    public static void main(String args[]){

        //################# DEBUG ##################

        //Board.Tile(Board.GO());

        



        
        Scanner scan=new Scanner(System.in);
        Integer Roll=0; 
        Integer CTILE=Board.GO();
        //Integer Player1STATE=CTILE;
        boolean Juego=true;
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
        while(Juego&&Player1NOTBankrupt){
            CTILE=Player1.getTILE();
            System.out.println("Roll Dice? 1(Yes) or 0(No) ");
            if (scan.hasNextInt()) {
                Roll = scan.nextInt();
                scan.nextLine(); //Consume input
                if (Roll == 1) {
                    Integer NTILE=TurnState(Player1,CTILE);
                    // DEBUG WHAT IS THE NEXT TILE System.out.println(NTILE);
                    Player1.SetTILE(NTILE);

                } else if (Roll == 0) {
                    System.out.println("Thanks for playing:");
                    Juego=false;
                }
            } else {
                System.out.println("Invalid input. Please enter 1 or 0.");
                scan.next(); // Consume the invalid input
            }
            //Juego=false;
        }
        /* 
        while(Player2NOTBankrupt){
            System.out.println("Roll Dice? 1(Yes) or 0(No) ");
            Integer Roll=scan.nextInt();
            if(Roll==1){
                TurnState(Player2, CTILE);
            }else if(Roll==0){

            }
            Juego=false;
        }
            */
        //Juego=true;
        /* 
        while(Player3NOTBankrupt){
            
        }
        while(Player4NOTBankrupt){
            
        }
        */
        scan.close();
        
    }        
}

