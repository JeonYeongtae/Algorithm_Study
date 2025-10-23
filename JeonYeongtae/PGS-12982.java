import java.util.*;

class Solution {
	public int solution(int[] d, int budget) {
		Array.sort(d);
		int result = 0;
		
		for (int price : d) {
			budget -= price;
			
			if (budget < 0) {
			break;
			}
			
			result ++;
		} // for
		
		return result;
	}
}