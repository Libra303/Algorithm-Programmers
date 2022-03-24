package Level_1;

import java.util.ArrayList;

public class x만큼_간격이_있는_n개의_숫자 {
	
	public ArrayList<Long> solution(int x, int n) {
	
		ArrayList<Long> arr = new ArrayList<Long>();
		
		for(long i = 1; i <= n; i++) {
			arr.add(x*i);
		}

		return arr;
	}
	

}
