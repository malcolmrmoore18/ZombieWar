package zombiewar;

/**
 *
 * Malcolm Moore 12/2/22
 */
public class Tank extends Zombie{
            
    Tank(){
        super.setStartingHealth(150);
        super.setCurrentHealth(150);
        super.setAttackDamage(20);
        super.setCharType("Tank");
    }
}
