public class ProfitAndLoss{
	public static void main(String[] args){
		double CostPrice = 129;
		double SellingPrice = 191;
		
		double Profit = SellingPrice - CostPrice;
		double ProfitPercentage = (Profit / CostPrice)*100;
		
		System.out.println("The Cost Price in INR " + CostPrice + " and Selling Price is INR " + SellingPrice + "\n The Profit is INR " + Profit + " and the Profit Percentage is " + ProfitPercentage); 
		
	}
}	