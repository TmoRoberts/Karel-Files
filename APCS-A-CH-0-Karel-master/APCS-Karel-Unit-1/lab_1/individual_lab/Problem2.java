package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        figureS();
        zigzag();
        startingPosition();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void figureS() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    public void zigzag() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
    }
    public void startingPosition () {
        turnLeft();
        move();
        turnLeft();
    }
}