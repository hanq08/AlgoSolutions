package test.AlgoSolutions;

public class Solution6p6 {
	static int maxProfit(int[] stocks){
		if (stocks == null || stocks.length == 0){
			return 0;
		}
		int min = stocks[0];
		int profit = Integer.MIN_VALUE;
		for (int i=0; i<stocks.length; i++){
			min = Math.min(min, stocks[i]);
			profit = Math.max(profit, stocks[i] - min);
		}
		return profit;
	}
}
