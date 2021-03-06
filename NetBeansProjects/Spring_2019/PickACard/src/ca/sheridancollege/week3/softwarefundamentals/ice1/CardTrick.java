/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modifier:Harkirat Cheema
 * @author Sivagami
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input=new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.getRandom());
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Suit you want to enter : ");
        String suit=input.nextLine();
        
        System.out.println("Enter any value from 1 to 13 : ");
        int number=input.nextInt();
         for(int j=0; j<magicHand.length;j++){
            if(suit.equals(magicHand[j].getSuit()) && number==magicHand[j].getValue()){
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found!");
            }
         }
        // and search magicHand here
        //Then report the result here
    }
    
}
