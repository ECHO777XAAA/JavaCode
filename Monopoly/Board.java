package Monopoly;

import java.util.*;

public class Board extends Monopoly{

    /*
     * METHOD to edit Tile Array in TILE method to desired tile on board
     */

 

    public static ArrayList<String> BOARD(int position){
        System.out.println();
        ArrayList<String> Tile=new ArrayList<>(100);
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

                //############################################ Visiting Jail
                else if (position==11){
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

                //############################################ FREE PARKING
                else if (position==21){
                //SwitchCase 21
                    if(Tile.size()==0){
                            for (int i=0;i<100;i++){
                                Tile.add("#");
                        }
                        }else{
                            for (int i=0;i<100;i++){
                                Tile.set(i,"#");
                        }
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
                    //############################################ GO TO JAIL
                else if (position==31){
                    if(Tile.size()==0){
                        for (int i=0;i<100;i++){                                    //CHANGE CONTROL EDITED ARRAY
                            Tile.add("#");
                    }
                    }else{
                        for (int i=0;i<100;i++){
                            Tile.set(i,"#");
                        }   
                    }
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

                    Tile.set(28," ");
                    Tile.set(29,"G");
                    Tile.set(30,"O");
                    Tile.set(31," ");

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
 //####################################### EDGE1 TILES ###################################################               
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==2){

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
                    Tile.set(28,"M");
                    Tile.set(29,"E");
                    Tile.set(30,"D");
                    Tile.set(31,"I");

                    Tile.set(46,"T");
                    Tile.set(47,"R");
                    Tile.set(48,"A");
                    Tile.set(49,"N");
                    Tile.set(50,"E");
                    Tile.set(51,"A");
                    Tile.set(52,"N");
                    Tile.set(53," ");

                    Tile.set(69,"A");
                    Tile.set(70,"V");
                    Tile.set(71,"E");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==3){
                      
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
                    Tile.set(28,"C");
                    Tile.set(29,"O");
                    Tile.set(30,"M");
                    Tile.set(31,"-");

                    Tile.set(46,"M");
                    Tile.set(47,"U");
                    Tile.set(48,"N");
                    Tile.set(49,"I");
                    Tile.set(50,"T");
                    Tile.set(51,"Y");
                    Tile.set(52," ");
                    Tile.set(53,"C");

                    Tile.set(68,"H");
                    Tile.set(69,"E");
                    Tile.set(70,"S");
                    Tile.set(71,"T");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==4){
                        
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

                    Tile.set(27,"B");
                    Tile.set(28,"A");
                    Tile.set(29,"L");
                    Tile.set(30,"T");
                    Tile.set(31,"I");
                    Tile.set(32,"C");

                    Tile.set(46," ");
                    Tile.set(47," ");
                    Tile.set(48,"A");
                    Tile.set(49,"V");
                    Tile.set(50,"E");
                    Tile.set(51," ");
                    Tile.set(52," ");
                    Tile.set(53," ");

                    Tile.set(68," ");
                    Tile.set(69," ");
                    Tile.set(70," ");
                    Tile.set(71," ");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==5){ 
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
                    Tile.set(27,"I");
                    Tile.set(28,"N");
                    Tile.set(29,"C");
                    Tile.set(30,"O");
                    Tile.set(31,"M");
                    Tile.set(32,"E");

                    Tile.set(46," ");
                    Tile.set(47," ");
                    Tile.set(48,"T");
                    Tile.set(49,"A");
                    Tile.set(50,"X");
                    Tile.set(51,"E");
                    Tile.set(52,"S");
                    Tile.set(53," ");

                    Tile.set(68," ");
                    Tile.set(69," ");
                    Tile.set(70," ");
                    Tile.set(71," ");
                    return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==6){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28,"R");
                    Tile.set(29,"E");
                    Tile.set(30,"A");
                    Tile.set(31,"D");
                    Tile.set(32," ");

                    Tile.set(46,"R");
                    Tile.set(47,"A");
                    Tile.set(48,"I");
                    Tile.set(49,"L");
                    Tile.set(50,"R");
                    Tile.set(51,"O");
                    Tile.set(52,"A");
                    Tile.set(53,"D");

                    Tile.set(68," ");
                    Tile.set(69," ");
                    Tile.set(70," ");
                    Tile.set(71," ");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==7){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29," ");
                    Tile.set(30," ");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46,"O");
                    Tile.set(47,"R");
                    Tile.set(48,"I");
                    Tile.set(49,"E");
                    Tile.set(50,"N");
                    Tile.set(51,"T");
                    Tile.set(52,"A");
                    Tile.set(53,"L");

                    Tile.set(68,"A");
                    Tile.set(69,"V");
                    Tile.set(70,"E");
                    Tile.set(71," ");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==8){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29," ");
                    Tile.set(30," ");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46," ");
                    Tile.set(47,"C");
                    Tile.set(48,"H");
                    Tile.set(49,"A");
                    Tile.set(50,"N");
                    Tile.set(51,"C");
                    Tile.set(52,"E");
                    Tile.set(53," ");

                    Tile.set(68," ");
                    Tile.set(69," ");
                    Tile.set(70," ");
                    Tile.set(71," ");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==9){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29," ");
                    Tile.set(30," ");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46,"V");
                    Tile.set(47,"E");
                    Tile.set(48,"R");
                    Tile.set(49,"M");
                    Tile.set(50,"O");
                    Tile.set(51,"N");
                    Tile.set(52,"T");
                    Tile.set(53," ");

                    Tile.set(68," ");
                    Tile.set(69,"A");
                    Tile.set(70,"V");
                    Tile.set(71,"E");
                return Tile;
                }
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==10){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29," ");
                    Tile.set(30," ");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46,"C");
                    Tile.set(47,"O");
                    Tile.set(48,"N");
                    Tile.set(49,"N");
                    Tile.set(50,"E");
                    Tile.set(51,"C");
                    Tile.set(52,"T");
                    Tile.set(53," ");

                    Tile.set(68," ");
                    Tile.set(69,"A");
                    Tile.set(70,"V");
                    Tile.set(71,"E");
                return Tile;
                }
    //###################################################### EDGE 2 TILES ###################################################################
                // ################################ CHANGE CONTROL CHANGE CONTROL CHANGE CONTROL 
                else if (position==12){
                    
                        
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29,"S");
                    Tile.set(30,"T");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46,"C");
                    Tile.set(47,"H");
                    Tile.set(48,"A");
                    Tile.set(49,"R");
                    Tile.set(50,"L");
                    Tile.set(51,"E");
                    Tile.set(52,"S");
                    Tile.set(53," ");

                    Tile.set(68,"P");
                    Tile.set(69,"L");
                    Tile.set(70,"A");
                    Tile.set(71,"C");
                return Tile;
                }
                
                else if (position==13){
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
                    Tile.set(27," ");
                    Tile.set(28," ");
                    Tile.set(29," ");
                    Tile.set(30," ");
                    Tile.set(31," ");
                    Tile.set(32," ");

                    Tile.set(46,"E");
                    Tile.set(47,"L");
                    Tile.set(48,"E");
                    Tile.set(49,"C");
                    Tile.set(50,"R");
                    Tile.set(51,"I");
                    Tile.set(52,"C");
                    Tile.set(53," ");

                    Tile.set(68,"C");
                    Tile.set(69,"O");
                    Tile.set(70,"M");
                    Tile.set(71,"P");
                return Tile;
            }
            else if (position==14){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");  
                return Tile;
            }
            else if (position==15){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==16){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");    
                return Tile;
            }
            else if (position==17){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==18){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");    
                return Tile;
            }
            else if (position==19){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==20){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==22){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==23){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==24){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==25){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==26){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==27){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==28){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==29){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==30){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
        
            else if (position==32){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==33){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==34){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==35){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==36){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==37){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==38){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==39){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }
            else if (position==40){
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
                Tile.set(27," ");
                Tile.set(28," ");
                Tile.set(29," ");
                Tile.set(30," ");
                Tile.set(31," ");
                Tile.set(32," ");

                Tile.set(46," ");
                Tile.set(47," ");
                Tile.set(48," ");
                Tile.set(49," ");
                Tile.set(50," ");
                Tile.set(51," ");
                Tile.set(52," ");
                Tile.set(53," ");

                Tile.set(68," ");
                Tile.set(69," ");
                Tile.set(70," ");
                Tile.set(71," ");
                return Tile;
            }

    //
//####################################################################################################


            else{
                System.out.println("DEBUG4:BOARDELSE");
                //Arraylist Luxury
                //Arraylist Income Tax 
                return Tile; 
            }
    }








    /*
     * METHOD to differenciate tiles and return tile to be printed
     */
    public static ArrayList<String> Tile(int TileNUM){

        ArrayList<String> TilE=new ArrayList<>(100);
        switch (TileNUM) {
            // SIDE 1
            case 1:
                //Go
                TilE=BOARD(1);
                break;
            case 2:
                //Mediteranian Avenue
                TilE=BOARD(2);
                break;
            case 3:
                //Community Chest
                TilE=BOARD(3);
                break;
            case 4:
                //Baltic Avenue
                TilE=BOARD(4);
                break;
            case 5:
                //INCOMETAX
                TilE=BOARD(5);
                break;
            case 6:
                //INCOMETAX
                TilE=BOARD(6);
                break;
            case 7:
                //Oriental Avenue
                TilE=BOARD(7);
                break;
            case 8:
                //Oriental Avenue
                TilE=BOARD(8);
                break;
            case 9:
                //Vermont Avenue
                TilE=BOARD(9);
                break;
            case 10:
                //Connecticut Avenue
                TilE=BOARD(10);
                break;
            //SIDE 2
            case 11:
                TilE=BOARD(11);
                break;
            case 12:
                TilE=BOARD(12);
                break;
            case 13:
                TilE=BOARD(13);
                break;
            case 14:
                TilE=BOARD(14);
                break;
            case 15:
                TilE=BOARD(15);
                break;
            case 16:
                TilE=BOARD(16);
                break;   
            case 17:
                TilE=BOARD(17);
                break;
            case 18:
                TilE=BOARD(18);
                break;
            case 19:
                TilE=BOARD(19);
                break;
            case 20:
                TilE=BOARD(20);
                break;
            //SIDE 3   
            case 21:
                TilE=BOARD(21);
                break;
            case 22:
                TilE=BOARD(22);
                break;
            case 23:
                TilE=BOARD(23);
                break;
            case 24:
                TilE=BOARD(24);
                break;
            case 25:
                TilE=BOARD(25);
                break;
            case 26:
                TilE=BOARD(26);
                break;   
            case 27:
                TilE=BOARD(27);
                break;
            case 28:
                TilE=BOARD(28);
                break;
            case 29:
                TilE=BOARD(29);
                break;
            case 30:
                TilE=BOARD(30);
                break;
            //SIDE 4    
            case 31:
                TilE=BOARD(31);
                break;
            case 32:
                TilE=BOARD(32);
                break;
            case 33:
                TilE=BOARD(33);
                break;
            case 34:
                TilE=BOARD(34);
                break;
            case 35:
                TilE=BOARD(35);
                break;
            case 36:
                TilE=BOARD(36);
                break;   
            case 37:
                TilE=BOARD(37);
                break;
            case 38:
                TilE=BOARD(38);
                break;
            case 39:
                TilE=BOARD(39);
                break;
            case 40:
                TilE=BOARD(40);
                break;
            default:
                System.out.println("DEBUG:INPUTCASE");
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

    //EDGE 2 TILES
    public static Integer STCHARLES(){
        return 12;
    }
    public static Integer ELECTRICCOMP(){
        return 13;
    }
    public static Integer STATESAVE(){
        return 14;
    }
    public static Integer VIRGINIAAVE(){
        return 15;
    }
    public static Integer PENRAIL(){
        return 16;
    }
    public static Integer STJAMES(){
        return 17;
    }
    public static Integer CommunityChest2(){
        return 18;
    }
    public static Integer TENNAVE(){
        return 19;
    }
    public static Integer NYAVE(){
        return 20;
    }
    //EDGE 3 TILES
    public static Integer KENAVE(){
        return 22;
    }
    public static Integer CHANGE2(){
        return 23;
    }
    public static Integer INDIANAAVE(){
        return 24;
    }
    public static Integer ILLAVE(){
        return 25;
    }
    public static Integer BORAIL(){
        return 26;
    }
    public static Integer ATLAVE(){
        return 27;
    }
    public static Integer VENAVE(){
        return 28;
    }
    public static Integer WATERW(){
        return 29;
    }
    public static Integer MARVGARD(){
        return 30;
    }
    //EDGE 4 TILES
    public static Integer PACAVE(){
        return 32;
    }
    public static Integer NOCARAVE(){
        return 33;
    }
    public static Integer CommunityChest3(){
        return 34;
    }
    public static Integer PENNAVE(){
        return 35;
    }
    public static Integer SHORTLINE(){
        return 36;
    }
    public static Integer CHANCE3(){
        return 37;
    }
    public static Integer PRKPLACE(){
        return 38;
    }
    public static Integer LUXTAX(){
        return 39;
    }
    public static Integer BOARDWLK(){
        return 40;
    }
}

