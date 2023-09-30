package practice.opp;

/**
 *
 * @author Lenovo
 */
public class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
