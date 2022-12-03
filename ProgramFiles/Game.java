package zombiewar;

/**
 *
 * Malcolm Moore 12/2/22
 */

import java.util.*;

public class Game {
    private List<Zombie> zombieList = new ArrayList<>();
    private List<Survivor> survivorList = new ArrayList<>();
    private boolean isRunning = true;
    
    
    Game(){
        //game logic
        while (isRunning){
            System.out.println("test start");
            isRunning = false;
        }
    }
    
    public void createCharacters(){
        
    }
    
    public void survivorsAttack(){
        
    }
    
    public void zombiesAttack(){
        
    }
    
    public void declareWinner(){
        
    }
}
