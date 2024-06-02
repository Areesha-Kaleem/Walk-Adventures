package Walk;

import java.util.Scanner;

public class ControlledWalk {
    Hurdles btt = new Hurdles();
    public double distance;
    Scanner sc = new Scanner(System.in);
    public int move;
    @Override
    public String toString() {
        return "Starting: Ali is at (" + Hurdles.x + "," + Hurdles.y + ")" ;
    }
    ControlledWalk(String name){
        btt.player = name;
    }
    public void WalkC() {
        System.out.print("Where you wanna move: ");
        this.move = sc.nextInt();
        btt.movement(this.move);
    }
    public void Cdis(){
        this.distance = Math.sqrt(Math.pow((Hurdles.x - btt.x1), 2) + Math.pow((Hurdles.y - btt.y1), 2));
        System.out.printf("The distance moved by %s: %.4f",btt.player, this.distance);
        System.out.println();
    }
}