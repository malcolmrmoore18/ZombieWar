
package zombiewar;

/**
 *
 * Malcolm Moore 12/2/22
 */
public class Soldier extends Survivor{
            
    Soldier(){
        super.setStartingHealth(100);
        super.setCurrentHealth(100);
        super.setAttackDamage(10);
        super.setCharType("Soldier");
    }
}
