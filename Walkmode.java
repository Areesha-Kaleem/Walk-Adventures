package Walk;

import java.util.Random;
import java.util.Scanner;

public class Walkmode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of First person who is walking: ");
        String AliName = sc.next();
        System.out.print("Enter the name of Second person who is walking: ");
        String HassanName = sc.next();

        ControlledWalk Ali = new ControlledWalk(AliName);
        RandomWalk Hassan = new RandomWalk(HassanName);
        Hurdles hb = new Hurdles();

        System.out.print("Enter no of steps: ");
        int st = sc.nextInt();
        hb.setSteps(st);

        hb.randomWalker = Hassan;
        hb.controlledWalker = Ali;
        System.out.println(Ali);
        System.out.println(Hassan);
        System.out.println("Hassan has Random Movement, Ali follows order");
        hb.WalkLoop();
    }
}






