package Walk;

import java.util.Random;
public class RandomWalk {
    Hurdles att = new Hurdles();
    public double distance;
    public int move;
    @Override
    public String toString() {
        return "Starting:  Hassan is at (" + Hurdles.x + "," + Hurdles.y + ")" ;
    }
    RandomWalk(String name){
        att.player = name;
    }
    public void WalkR() {
        Random rn = new Random();
        this.move = rn.nextInt(4) + 1;
        att.movement(this.move);
    }
    public void Rdis(){
        this.distance = Math.sqrt(Math.pow((Hurdles.x - att.x1), 2) + Math.pow((Hurdles.y - att.y1), 2));
        System.out.printf("The distance moved by %s: %.4f",att.player, this.distance);
        System.out.println();
    }
}