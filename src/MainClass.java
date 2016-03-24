import java.util.Arrays;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Binary Gap
		 Solution2 tempSolution = new Solution2();
		 int num = tempSolution.solution(51712);
		 System.out.println(Integer.toString(num));
		 
		 //Cyclic Rotate
		 CyclicRotate cyclicRotate = new CyclicRotate();
		 
		 int[] A = {3,5,2,5};
		 int K = 3;
		 int[] rotatedArr = cyclicRotate.solution(A, K);
		 System.out.println("Rotated array: " + Arrays.toString(rotatedArr) + " , # of Rotations: "+ Integer.toString(K));
	}

}
