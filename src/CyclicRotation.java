
public class CyclicRotation {

	    public int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	        

	        int[] last = A;
	        for (int i = 0; i < K; i++) {
	        	int lastNum = last[last.length-1];
	        	
	        	int tempFirstInLast = last[0];
	        	
	        	
	        	for (int j = last.length-2; j >= 0; j--) {
					last[j+1] = last[j];
				}
	        	
	        	last[0] = lastNum;
	        	
	        	last[A.length-1] = tempFirstInLast;
			}
	        
	        return last;
	      
	    }

}
