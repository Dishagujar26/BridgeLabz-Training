
// Creating a class with name ProfitCalculation indicating the purpose which is to calculate the profit and profit percentage.

public class ProfitCalculation{
    public static void main(String []args){
	
	    //create an int variables to store the value of cost price of INR
	    int costPrice = 129;
		
		//create an int variables to store the value of selling price of INR
	    int sellPrice = 191;
		
		// Create an int variable Profit and calculate the profit
		int profit  = sellPrice-costPrice;
		
		// Create a double variable profitPercentage and calculate the Profit Percentage
		int profitPercentage  = (profit/costPrice) * 100;
		
		System.out.println("The Cost Price is INR "+ costPrice+ " and Selling Price is INR " + sellPrice + "\n The Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercentage);
	}
}