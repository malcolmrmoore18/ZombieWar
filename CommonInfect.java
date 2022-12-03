package zombiewar;

import java.util.Set;

/**
 *
 * Malcolm Moore 12/2/22
 */
public class CommonInfect extends Zombie{
            
    CommonInfect(){
        super.setStartingHealth(30);
        super.setCurrentHealth(30);
        super.setAttackDamage(5);
        super.setCharType("CommonInfect");
    }
}
