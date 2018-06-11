
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kylecieskiewicz
 */
public class HealthyHearts {

    public static void main(String[] args) {

        int usersAge = 0;
        int max = 0;
        int lowZone = 0;
        int highZone = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        if (sc.hasNextInt()) {
            usersAge = sc.nextInt();

            if (usersAge > 0 || usersAge < 150) {

                max = 220 - usersAge;
                System.out.println("\nYour maximum heart rate should be " + max + " beats per minute.");
                lowZone = (int) (Math.round(.5 * max));
                highZone = (int) (Math.round(.85 * max));
                System.out.println("Your target heart rate zone is " + lowZone + " - " + highZone + " beats per minute.");
            } 

        }

    }
}
