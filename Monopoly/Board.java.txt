package Monopoly;

import java.util.*;

public class Board extends Monopoly{

    /*
     * METHOD to edit Tile Array in TILE method to desired tile on board
     */
    

    public static ArrayList<String> BOARD(int position){
        System.out.println();
        ArrayList<String> Tile=new ArrayList<>(10);
        //String Tile=new String(" ");
        //ArrayList<String> corner = new ArrayList<>();
       //ArrayList<String> rectangle = new ArrayList<>(101); 

                if (position==1){
                //ArrayList corner tile
                    
                    if(Tile.size()==0){
                            for (int i=0;i<100;i++){
                                Tile.add("#");
                            }
                        }else{
                            for (int i=0;i<100;i++){
                                Tile.set(i,"#");
                            }
                        }
                    
                    for (int i=21;i<39;i++){
                        Tile.set(i," ");
                    }
                    for (int i=41;i<59;i++){
                        Tile.set(i," ");
                    }
                    for (int i=61;i<79;i++){
                        Tile.set(i," ");
                    }
                    Tile.set(29,"G");
                    Tile.set(30,"O");
                return Tile;
                }
                if (position==11){
                //Switch Case 11 Just Visiting Jail
                    if(Tile.size()==0){
                            for (int i=0;i<100;i++){
                                Tile.add("#");
                        }
                        }else{
                            for (int i=0;i<100;i++){
                                Tile.set(i,"#");
                        }
                    }
                    for (int i=21;i<39;i++){
                        Tile.set(i," ");
                    }
                    for (int i=41;i<59;i++){
                        Tile.set(i," ");
                    }
                    for (int i=61;i<79;i++){
                        Tile.set(i," ");
                    }
                    Tile.set(28,"J");
                    Tile.set(29,"U");
                    Tile.set(30,"S");
                    Tile.set(31,"T");

                    Tile.set(46,"V");
                    Tile.set(47,"I");
                    Tile.set(48,"S");
                    Tile.set(49,"I");
                    Tile.set(50,"T");
                    Tile.set(51,"I");
                    Tile.set(52,"N");
                    Tile.set(53,"G");
                        return Tile;
                }
                if (position==21){
                //SwitchCase 21
                    for (int i=0;i<100;i++){
                        Tile.set(i,"#");
                    }
                    for (int i=21;i<39;i++){
                        Tile.set(i," ");
                    }
                    for (int i=41;i<59;i++){
                        Tile.set(i," ");
                    }
                    for (int i=61;i<79;i++){
                        Tile.set(i," ");
                    }
                    Tile.set(28,"F");
                    Tile.set(29,"R");
                    Tile.set(30,"E");
                    Tile.set(31,"E");

                    Tile.set(46,"P");
                    Tile.set(47,"A");
                    Tile.set(48,"R");
                    Tile.set(49,"K");
                    Tile.set(50,"I");
                    Tile.set(51,"N");
                    Tile.set(52,"G");
                    Tile.set(53,"!");
                        return Tile;
                    }

                if (position==31){
                    for (int i=0;i<100;i++){
                        Tile.set(i,"#");
                    }
                    for (int i=21;i<39;i++){
                        Tile.set(i," ");
                    }
                    for (int i=41;i<59;i++){
                        Tile.set(i," ");
                    }
                    for (int i=61;i<79;i++){
                        Tile.set(i," ");
                    }
                    Tile.set(28,"");
                    Tile.set(29,"G");
                    Tile.set(30,"O");
                    Tile.set(31,"");

                    Tile.set(46,"T");
                    Tile.set(47,"O");
                    Tile.set(48," ");
                    Tile.set(49,"J");
                    Tile.set(50,"A");
                    Tile.set(51,"I");
                    Tile.set(52,"L");
                    Tile.set(53," ");
                        return Tile;
                     }
            
                //Arraylist rectangular tile
                if (position==13){
                    if(Tile.size()==0){
                        for (int i=0;i<100;i++){
                            Tile.add("#");
                        }
                    }else{
                        for (int i=0;i<100;i++){
                            Tile.set(i,"#");
                        }
                    }
                    for (int i=11;i<19;i++){
                        Tile.set(i," ");
                    }
                    for (int i=21;i<29;i++){
                        Tile.set(i," ");
                    }
                    for (int i=31;i<39;i++){
                        Tile.set(i," ");
                    }
                    for (int i=41;i<49;i++){
                        Tile.set(i," ");
                    }
                    for (int i=51;i<59;i++){
                        Tile.set(i," ");
                    }
                    for (int i=61;i<69;i++){
                        Tile.set(i," ");
                    }
                    for (int i=71;i<79;i++){
                        Tile.set(i," ");
                    }
                    for (int i=81;i<89;i++){
                        Tile.set(i," ");
                    }
                return Tile;
            }
            else{
                System.out.println("DEBUGGGG");
                //Arraylist Luxury
                //Arraylist Income Tax 
                return Tile; 
            }
    }

    /*
     * METHOD to differenciate tiles 
     */
    public static ArrayList<String> Tile(int TileNUM){

        ArrayList<String> TilE=new ArrayList<>(100);
        switch (TileNUM) {
            case 1:
                //Go
                TilE=BOARD(1);
                break;
            case 2:
                //Mediteranian Avenue
                TilE=BOARD(2);
                break;
            case 4:
                //Baltic Avenue
                TilE=BOARD(4);
                break;
            case 7:
                //Oriental Avenue
                TilE=BOARD(7);
                break;
            case 9:
                //Vermont Avenue
                TilE=BOARD(9);
                break;
            case 10:
                //Connecticut Avenue
                TilE=BOARD(10);
                break;
            case 11:
                TilE=BOARD(11);
                break;
            
            
            
            case 21:
                TilE=BOARD(21);
                break;
            case 31:
                TilE=BOARD(31);
                break;
            default:
                break;
        }
        return TilE;
        
    }

    //CORNER TILES #################################
    public static Integer GO(){
        return 1;
    }

    public static Integer JustVisiting(){
        return 11;
    }

    public static Integer FREEPARKING(){
        return 21;
    }

    public static Integer GoToJail(){
        return 31;
    }
    //EDGE 1 TILES ############################
    public static Integer MEDAVE(){
        return 2;
    }

    public static Integer CommunityChest(){
        return 3;
    }

    public static Integer BALAVE(){
        return 4;
    }

    public static Integer INCOMETAX(){
        return 5;
    }
    public static Integer READINGRAIL(){
        return 6;
    }

    public static Integer ORIENAVE(){
        return 7;
    }

    public static Integer CHANCE(){
        return 8;
    }

    public static Integer VERMAVE(){
        return 9;
    }
    public static Integer CONNECAVE(){
        return 10;
    }


}

