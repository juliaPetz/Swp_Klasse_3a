package recursion;

public class BinomialCoefficient {
	
	public static int calculateBC(int n, int k) {
		if(k==0 || k==n) {
			return 1;
		} else {
			return calculateBC(n-1,k-1) + calculateBC(n-1,k);
		}
	}

	public static void main(String[] args) {
		System.out.println(calculateBC(4,2));

	}

}
