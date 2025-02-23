package Monopoly;
import java.util.*;
public abstract class Print extends Monopoly{
    
    public static void PrintCorner(ArrayList<String> tile){
        ArrayList<String> ARRAYLIST = new ArrayList<>(100);
        ARRAYLIST=tile;

        String[] PRINTME=new String[ARRAYLIST.size()];
        for(int i=0;i<ARRAYLIST.size();i++){
            PRINTME[i]=ARRAYLIST.get(i);
        }

        for(int i=0;i<100;i++){
            if(i%20<=0){
                System.out.println();
            }
            System.out.print(PRINTME[i]);
        }
        System.out.println();
        System.out.println();
    }
    public static void PrintEDGE(ArrayList<String> tile){
        ArrayList<String> ARRAYLIST = new ArrayList<>(100);
        ARRAYLIST=tile;

        String[] PRINTME=new String[ARRAYLIST.size()];
        for(int i=0;i<ARRAYLIST.size();i++){
            PRINTME[i]=ARRAYLIST.get(i);
        }

        for(int i=0;i<100;i++){
            if(i%10<=0){
                System.out.println();
            }
            System.out.print(PRINTME[i]);
        }
        System.out.println();
        System.out.println();
    }
}    
    

