
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
public class RockPaperScissors {
    
    public static void main(String[] args)
   {
       
   
        int cChoice; 
        int pChoice = 0; 
        int cScore = 0, pScore = 0, tie = 0, rounds = 0; 
        String againInput = "no"; 
        String hInput = "R";
        String hChoice = "R";
        Scanner input = new Scanner(System.in); 
        Random rgen = new Random();
        System.out.println("We are playing Rock Paper Scissors!");
        
        do
        {
                System.out.println("Please enter the number of times you would like to play. The max amount of times is 10.");
                int numberOfRounds = input.nextInt();
                
                if(numberOfRounds == 0){
                    numberOfRounds = 13;
                }

                while ((numberOfRounds >= 0) && (numberOfRounds < 11)) 
                { 
                    cChoice=rgen.nextInt(3)+1;
                    System.out.println("Please make your selection: R - Rock. P - Paper. S - Scissors");
                    hInput = input.nextLine();  
                    hChoice = hInput.toUpperCase(); 
                    if (hChoice.equals("R") || hChoice.equals("P") || hChoice.equals("S")) 
                    {
                        System.out.println("");

                        if (hChoice.equals("R"))  
                        {
                            pChoice = 1;
                        }
                        if (hChoice.equals("P"))  
                        {
                            pChoice = 2;
                        }
                        if (hChoice.equals("S"))  
                        {
                            pChoice = 3;
                        }

                        if (pChoice == cChoice) 
                        { 
                            System.out.println("Tie Game!");
                            System.out.println("");
                            tie++;
                            rounds++;
                        } else      
                        {
                            if (cChoice==1 && pChoice==3) 
                            {
                                System.out.println("Computer picked Rock!");
                                System.out.println("Computer Wins!");
                                System.out.println("");
                                cScore++;
                                rounds++;
                            } 

                            if (cChoice==1 && pChoice==2) 
                            {
                                System.out.println("Computer picked Rock!");
                                System.out.println("Player Wins!");
                                System.out.println("");
                                pScore++;
                                rounds++;
                            } 

                            if (cChoice==2 && pChoice==3) 
                            {
                                System.out.println("Computer picked Paper!");
                                System.out.println("Player Wins!");
                                System.out.println("");
                                pScore++;
                                rounds++;
                            } 

                            if (cChoice==2 && pChoice==1) 
                            {
                                System.out.println("Computer picked Paper!");
                                System.out.println("Computer Wins!");
                                System.out.println("");
                                cScore++;
                                rounds++;
                            } 

                            if (cChoice==3 && pChoice==1)  
                            {
                                System.out.println("Computer picked Scissors!");
                                System.out.println("Player Wins!");
                                System.out.println("");
                                pScore++;
                                rounds++;
                            } 

                            if (cChoice==3 && pChoice==2) 
                            {
                                System.out.println("Computer picked Scissors!");
                                System.out.println("Computer Wins!");
                                System.out.println("");
                                cScore++;
                                rounds++;
                            } 

                        }                            
                    } 
                    numberOfRounds--;
                }
                
                if (numberOfRounds < 11)
                {
                    if(pScore > cScore){
                        System.out.println("You win!");
                    } else if(cScore > pScore){
                        System.out.println("The computer wins!");
                    } else {
                        System.out.println("It is a tie!");
                    }

                    System.out.println ("Here are the final scores after " + rounds +" rounds:");
                    System.out.println ("You\tComputer\tTies");
                    System.out.println (" "+ pScore +"\t   " + cScore + "\t\t " + tie);
                    rounds = 0;
                    pScore = 0;
                    cScore = 0;
                    tie = 0;
                    System.out.println("Would you like to play again? Yes or no.");
                    againInput = input.nextLine(); 
                    
                } else {
                    againInput = "error";
                }
        } while (againInput.equals("yes"));
        
        if(againInput.equals("error")){
            System.out.println("Error is not within number of rounds.");
            
        } else {
            System.out.println("Thanks for playing.");
        }
    

   }
}
