
public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] A = {5,12,9,2};
		int[] B = {4,9,8,7,4};
		int[] frequency = new int[1000];
		int lengthA = A.length;
		int lengthB = B.length;
		int  count = 0;
		for(int i = 0; i < lengthA; i++) {
			if(frequency[A[i]] == 0) {
				frequency[A[i]] = 1;
				count++;
			}
			
		}
		for(int i = 0; i < lengthB; i++) {
			if(frequency[B[i]] == 0) {
				frequency[B[i]] = 1;
				count++;
			}
			
		}
		int[] ans = new int[count];
		int k = 0;
		for(int i = 0; i < frequency.length; i++) {
			if(frequency[i] == 1) {
				ans[k++] = i;
				if(k == count)break;
			}
		}
		
		
		for(int i = 0; i < k; i++) {
			System.out.print(ans[i]);
			System.out.print(" ");
		}
		
	}

}
