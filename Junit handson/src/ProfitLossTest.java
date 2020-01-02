import static org.junit.Assert.*;

import org.junit.Test;

public class ProfitLossTest {

	@Test
	public void test() {
		ProfitLoss profit = new ProfitLoss();
		int result = profit.calculateProfit(100, 200);
		assertEquals(100,result);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCase() {
		ProfitLoss profit = new ProfitLoss();
		profit.calculateProfit(-100, 200);	
	}
    
	@Test (expected = IllegalArgumentException.class)
	public void testCase2() {
		ProfitLoss profit = new ProfitLoss();
		profit.calculateProfit(100, -200);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCase3() {
		ProfitLoss profit = new ProfitLoss();
		profit.calculateProfit(-100, -200);	
	}
}
