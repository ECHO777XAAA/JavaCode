package Monopoly;

import java.util.Random;
public class Dice extends Monopoly{
    
    public static Integer Dice1(){
        Random random = new Random();
        int roll = (random.nextInt(5))+1;
        return roll;

        //PRINT THE DICE!!!

    }
    public static Integer Dice2(){
        Random random = new Random();
        int roll = (random.nextInt(5))+1;
        return roll;   
        
        //PRINT THE DICE!!!
        
    }
}
