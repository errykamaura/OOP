package practice.opp;

/**
 *
 * @author Lenovo
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    
    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
    
}
