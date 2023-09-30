package practice.opp;

/**
 *
 * @author Lenovo
 */
public class RedHeadDuck extends Duck {
    
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a real Read Haded duck");
    }
    
}
