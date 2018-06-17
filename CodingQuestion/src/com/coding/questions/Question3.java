/**
 * 
 */
package com.coding.questions;

/**
 * Question 3 -- changePossibilities(amount,amount): Your quirky boss collects
 * rare, old coins. They found out you're a programmer and asked you to solve
 * something they've been wondering for a long time.
 * 
 * Write a function that, given an amount of money and an array of coin
 * denominations, computes the number of ways to make the amount of money with
 * coins of the available denominations.
 * 
 * 
 * @author Aishwarya
 *
 */
class Question3 {
	
	public static void main(String[] args) {
		int [] coins= {1,2,3};
		int amount =4;
		
		Question3 obj=new Question3();
		obj.change(amount, coins);
		//System.out.println("numOfpossiblities : "+obj.change(amount, coins));
	}
	
	
	
    public int change(int amount, int[] coins) {
      int numOfpossiblities=0;
	for(int i=0;i<coins.length;i++)
		{
			int coinElement=coins[i];
			int denomination=0;
			for(int j=0;j<=amount;j++)
			{
				denomination+=coinElement;
				if(denomination==amount)
				{
					numOfpossiblities++;
					break;
				}	
			}
			
		}
    	return numOfpossiblities;
    }
}
