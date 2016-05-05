/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesion.pkg4;

import java.util.Random;
public class automobile 
{
    
    private static int dieNumbers; 
    private static int lowestValue = 1;
    private static int highestValue = 6;
    private static int operatingCycles; 
    
  
	public static int Throw(int dices)
	{
            dieNumbers = dices;
            lowestValue = lowestValue * dieNumbers;
            highestValue = highestValue * dieNumbers;
            Random rand = new Random();
            int diceValue = lowestValue + (int)(Math.random() * ((highestValue - lowestValue) + 1));
            return diceValue;
	}
        
        public static void cycles(int totalCycles)
        {
            operatingCycles = totalCycles; 
        }
    
}
