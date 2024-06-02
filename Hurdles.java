package Walk;

import java.util.Scanner;

public class Hurdles {
    RandomWalk randomWalker;
    ControlledWalk controlledWalker;
    public static int x = 0;
    public static int y = 0;
    public int x1;
    public int y1;
    public String player;
    public int steps;
    public int[][] arr = {{3, -2, 6}, {1, 4, -5}};
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public void movement(int m) {
        if (m == 1) {
            this.x1++;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (this.x1 == arr[j][k] && this.y1 == arr[1][k]) {
                        System.out.println("HURDLE");
                        this.x1--;
                        break;
                    }
                }
            }
            System.out.printf("%s is at: (%d,%d)",this.player, (int) this.x1, (int) this.y1);
            System.out.println();
        } else if (m == 2) {
            this.x1--;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (this.x1 == arr[j][k] && this.y1 == arr[1][k]) {
                        System.out.println("HURDLE");
                        this.x1++;
                        break;
                    }
                }
            }
            System.out.printf("%s is at: (%d,%d)",this.player, (int) this.x1, (int) this.y1);
            System.out.println();
        } else if (m == 3) {
            this.y1++;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (this.x1 == arr[j][k] && this.y1 == arr[1][k]) {
                        System.out.println("HURDLE");
                        this.y1--;
                        break;
                    }
                }
            }
            System.out.printf("%s is at: (%d,%d)",this.player, (int) this.x1, (int) this.y1);
            System.out.println();
        } else if (m == 4) {
            this.y1--;
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (this.x1 == arr[j][k] && this.y1 == arr[1][k]) {
                        System.out.println("HURDLE");
                        this.y1++;
                        break;
                    }
                }
            }
            System.out.printf("%s is at: (%d,%d)",this.player, (int) this.x1, (int) this.y1);
            System.out.println();
        }
    }
    public void WalkLoop(){
        for(int i = 0; i<steps; i++){
            controlledWalker.WalkC();
            randomWalker.WalkR();
        }
        controlledWalker.Cdis();
        randomWalker.Rdis();
    }
}
