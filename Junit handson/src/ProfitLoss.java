
public class ProfitLoss {
    int buyingPrice;
    int sellingPrice;
	public ProfitLoss() {
		
	}
    int calculateProfit(int buyingPrice, int sellingPrice) {
    	if(buyingPrice < 0 || sellingPrice < 0) {
    		throw new IllegalArgumentException();
    	}
    	return sellingPrice - buyingPrice;
    }
}
