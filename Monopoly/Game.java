package Monopoly;

import java.util.*;

public class Game extends Monopoly{
    
    
    static Integer ROLL;
    static Integer NEXTILE;
    static Integer CURRENTILE;
    static ArrayList<String> TILE=new ArrayList<>(100);

    public static Integer Play(int Tile){
                                  
        boolean GAME=true;
        /* 
                CURRENTILE=Board.;
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());                      
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!");
                TILE=Board.Tile(CURRENTILE);
                System.out.println("DEBUG"+CURRENTILE);
                Print.PrintCorner(TILE);
                
                //System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
        */

        //While Loop For ONE TURN PER PLAYER PUT INTO METHOD
        while(GAME) {
                //GO TILE
            if (Tile==1){
                CURRENTILE=Board.GO();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());                      //############ CHANGE CONTROL
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!");
                TILE=Board.Tile(CURRENTILE);
                System.out.println("DEBUG"+CURRENTILE);
                Print.PrintCorner(TILE);
                
                //System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
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
                System.out.println("YOU LANDED ON!:");
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
                System.out.println("YOU LANDED ON!:");
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
                if (CURRENTILE>=40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }

            if (Tile==2){
                CURRENTILE=Board.MEDAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==3){
                CURRENTILE=Board.CommunityChest();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==4){
                CURRENTILE=Board.BALAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==5){                                                      
                CURRENTILE=Board.INCOMETAX();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==6){
                CURRENTILE=Board.READINGRAIL();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==7){
                CURRENTILE=Board.ORIENAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==8){
                CURRENTILE=Board.CHANCE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==9){
                CURRENTILE=Board.VERMAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==10){
                CURRENTILE=Board.CONNECAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==12){
                CURRENTILE=Board.STCHARLES();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==13){
                CURRENTILE=Board.ELECTRICCOMP();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==14){
                CURRENTILE=Board.STATESAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==15){
                CURRENTILE=Board.VIRGINIAAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==16){
                CURRENTILE=Board.PENRAIL();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==17){
                CURRENTILE=Board.STJAMES();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==18){
                CURRENTILE=Board.CommunityChest2();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==19){
                CURRENTILE=Board.TENNAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==20){
                CURRENTILE=Board.NYAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==22){
                CURRENTILE=Board.KENAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==23){
                CURRENTILE=Board.CHANGE2();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==24){
                CURRENTILE=Board.INDIANAAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==25){
                CURRENTILE=Board.ILLAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==26){
                CURRENTILE=Board.BORAIL();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==27){
                CURRENTILE=Board.ATLAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==28){
                CURRENTILE=Board.VENAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==29){
                CURRENTILE=Board.WATERW();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==30){
                CURRENTILE=Board.MARVGARD();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==32){
                CURRENTILE=Board.PACAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==33){
                CURRENTILE=Board.NOCARAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==34){
                CURRENTILE=Board.CommunityChest3();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==35){
                CURRENTILE=Board.PENNAVE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==36){
                CURRENTILE=Board.SHORTLINE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==37){
                CURRENTILE=Board.CHANCE3();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==38){
                CURRENTILE=Board.PRKPLACE();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==39){
                CURRENTILE=Board.LUXTAX();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }
            if (Tile==40){
                CURRENTILE=Board.BOARDWLK();
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);
                ROLL=(Dice.Dice1()+Dice.Dice2());
                System.out.println("You rolled two dice for a: " + ROLL);
                NEXTILE=CURRENTILE+ROLL;
                CURRENTILE = NEXTILE;
                if (CURRENTILE>40){
                    int remain= CURRENTILE%40;
                    if (remain==0){
                        remain++;
                    }
                    CURRENTILE=remain;
                }
                System.out.println("YOU LANDED ON!:");
                TILE=Board.Tile(CURRENTILE);
                Print.PrintCorner(TILE);

                System.out.println("DEBUG"+CURRENTILE);
                GAME=false;
            }


        

        //Current tile reset after 40 if statement
            if (CURRENTILE>40){
                int remain= CURRENTILE%40;
                CURRENTILE=remain;
                GAME=false;
            }
            GAME=false;                                             //CHANGE CONTROL
        }

        //scan.close();
        return CURRENTILE;
    }
}