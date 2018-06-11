import java.util.Random;
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
public class DogGenetics {

public static void main(String[] args)
{
    Random r = new Random();
    Scanner input = new Scanner(System.in); 
    int count = 5;
    int numbers[] = new int[count];
    int sum = 0;
    int finalSum = 100;
    String dogName;
    System.out.println("What is your dog's name?");
    dogName = input.nextLine();
    
    for (int i = 0; i < count - 1; i++)
    {
        numbers[i] = r.nextInt((finalSum - sum) / 2) + 1;
        sum += numbers[i];
    }
    numbers[count - 1] = finalSum - sum;
    
    System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");

    StringBuilder numbersString = new StringBuilder(dogName + ": ");
    
    numbersString.append("St. Bernard %" + numbers[0] + "  ");
    numbersString.append("Chihuahua %" + numbers[1] + "  ");
    numbersString.append("Dramatic RedNosed Asian Pug %" + numbers[2] + "  ");
    numbersString.append("Common Cur %" + numbers[3] + "  ");
    numbersString.append("King Doberman %" + numbers[4] + "  ");
    System.out.println(numbersString);
}
    
}
