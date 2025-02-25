package Monopoly;

//import java.util.* ;

public class Player extends Monopoly{
    private Integer CTILE;
    private String player;
    
    public Player(String player, Integer CTILE){
        this.CTILE = CTILE;
        this.player= player;
    }
    public Integer GetTile(){
        return CTILE;
    }
    public String GetName(){
        return player;
    }
    public void SetTILE(Integer CTILE){
        this.CTILE =CTILE;
    }
    public void SetPlayer(String player){
        this.player = player;
    }
    public Integer getTILE(){
        return this.CTILE;
    }
    public String getPlayer(){
        return this.player;
    }
}
