import java.util.Arrays;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Binary Gap
		 BinaryGap2 tempSolution = new BinaryGap2();
		 int num = tempSolution.solution(51712);
		 System.out.println(Integer.toString(num));
		 
		 //Cyclic Rotate
		 CyclicRotation cyclicRotate = new CyclicRotation();
		 
		 int[] A = {3, 8, 9, 7, 6};
		 int K = 3;
		 int[] rotatedArr = cyclicRotate.solution(A, K);
		 System.out.println("Rotated array: " + Arrays.toString(rotatedArr) + " , # of Rotations: "+ Integer.toString(K));
	}

}
