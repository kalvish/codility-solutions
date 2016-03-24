
public class Solution2 {
	public int solution(int N) {
		
		//test
		String temp = Integer.toBinaryString(N);
		System.out.println(temp);
		 
		int maxCount = 0;
		int currentCount = 0;
		boolean isFirstOneArrived = true;
		int valueToCheck;
		while (N > 0) {
			valueToCheck = N & 1;			
			if(valueToCheck==1){
				isFirstOneArrived = false;
			}
			if(valueToCheck==0 && !isFirstOneArrived){
				currentCount++;
			}else{
				if(currentCount>maxCount){
					maxCount = currentCount;
				}
				currentCount = 0;		
			}
			N = N >> 1;
			//System.out.println(Integer.toString(N));			
		}	
		return maxCount;
	}
}
