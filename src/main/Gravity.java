/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
public class Gravity {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time;
        double speed;
        double distance;
        double g = 9.8;
        time = sc.nextDouble();
        speed = g * time;
        distance = 0.5 * g * time * time;
        System.out.print("The speed of the object at" + " " + time + "seconds after its release is" + " " + speed + " " + "and the distance the object has travelled in the" + time + "seconds after the relase is" + " " + distance);
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
