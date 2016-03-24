
public class Solution {

	public int solution(int N) {
        // write your code in Java SE 8
        //String binaryString = Integer.toBinaryString(N);
        int largestGap = 0;
        int currentGap = 0;
        
        String temp = toBinaryString(N);
      
        //"10001001"
        char[] cArray = temp.toCharArray();
        
        for (int i = 0; i < cArray.length; i++) {
        	char te = cArray[i];
        	if(te == '0'){
        		currentGap++;
        	}
        	if (te == '1'){
        		if(largestGap<currentGap){
        			largestGap = currentGap;
        		}
        		currentGap = 0;
        	}
		}
        return largestGap;
    }
	
	public static String toBinaryString(int i) {
        return toUnsignedString(i, 1);
    }
	
	 /**
     * Convert the integer to an unsigned number.
     */
    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32];
        int charPos = 32;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            buf[--charPos] = digits[i & mask];
            i >>>= shift;
        } while (i != 0);

        return new String(buf, charPos, (32 - charPos));
    }
    
    /**
     * All possible chars for representing a number as a String
     */
    final static char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
}
