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
        createCharacters();
        while (isRunning){
            System.out.println("game start");
            survivorsAttack();
            zombiesAttack();
            isRunning = declareWinner();
        }
    }

    public void createCharacters(){
        //Zombies created
        Tank zombie1 = new Tank();
        CommonInfect zombie2 = new CommonInfect();
        CommonInfect zombie3 = new CommonInfect();
        CommonInfect zombie4 = new CommonInfect();
        zombieList.add(zombie1);
        zombieList.add(zombie2);
        zombieList.add(zombie3);
        zombieList.add(zombie4);

        //Survivors created
        Child survivor1 = new Child();
        Teacher survivor2 = new Teacher();
        Soldier survivor3 = new Soldier();
        Soldier survivor4 = new Soldier();
        Soldier survivor5 = new Soldier();
        survivorList.add(survivor1);
        survivorList.add(survivor2);
        survivorList.add(survivor3);
        survivorList.add(survivor4);
        survivorList.add(survivor5);

    }

    public void survivorsAttack(){
        //determine which list is shorter to use for attacks, to prevent out of bounds exception
        if (survivorList.size() <= zombieList.size()){
            for (int i = 0; i < survivorList.size(); i++){
                if (survivorList.get(i).isAlive()){
                    zombieList.get(i).setCurrentHealth(zombieList.get(i).getCurrentHealth() - survivorList.get(i).getAttackDamage());
                }
            }
        }
        else{
            for (int i = 0; i < zombieList.size(); i++){
                if (survivorList.get(i).isAlive()){
                    zombieList.get(i).setCurrentHealth(zombieList.get(i).getCurrentHealth() - survivorList.get(i).getAttackDamage());
                }
            }
        }

        //check for characters that are no longer alive and update boolean
        for (Zombie z: zombieList){
            if (z.getCurrentHealth() < 1){
                z.setIsAlive(false);
            }
        }
    }

    public void zombiesAttack(){
        //determine which list is shorter to use for attacks, to prevent out of bounds exception
        if (zombieList.size() <= survivorList.size()){
            for (int i = 0; i < zombieList.size(); i++){
                if (zombieList.get(i).isAlive()){
                    survivorList.get(i).setCurrentHealth(survivorList.get(i).getCurrentHealth() - zombieList.get(i).getAttackDamage());
                }
            }
        }
        else{
            for (int i = 0; i < survivorList.size(); i++){
                if (zombieList.get(i).isAlive()){
                    survivorList.get(i).setCurrentHealth(survivorList.get(i).getCurrentHealth() - zombieList.get(i).getAttackDamage());
                }
            }
        }

        //check for characters that are no longer alive and update boolean
        for (Survivor s: survivorList){
            if (s.getCurrentHealth() < 1){
                s.setIsAlive(false);
            }
        }
    }

    //method determines if all members of a list are no longer alive,
    //then returns end game message and boolean value to end while loop
    public boolean declareWinner(){
        for (Survivor s: survivorList){
            if (s.isAlive()){
                return true;
            }
            else{
                System.out.println("Survivors wiped out!");
                return false;
            }
        }

        for (Zombie z: zombieList){
            if(z.isAlive()){
                return true;
            }
            else{
                System.out.println("Zombies defeated!");
                return false;
            }
        }

        return true;
    }
}
