
package zombiewar;

/**
 *
 * Malcolm Moore 12/2/22
 */
public class Child extends Survivor{
            
    Child(){
        super.setStartingHealth(20);
        super.setCurrentHealth(20);
        super.setAttackDamage(2);
        super.setCharType("Child");
    }
}
