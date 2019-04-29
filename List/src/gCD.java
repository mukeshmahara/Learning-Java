import java.util.Scanner;

public class gCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b, gcd;
		System.out.print("Enter value of a: ");
		a = sc.nextInt();
		System.out.print("Enter value of b: ");
		b = sc.nextInt();
		
		gcd = GCD(a,b);
		
		System.out.print(gcd);
		
		
	}
	
	public static int GCD(int A, int B) {
		int R;
		if (A == 0) {
			return B;
		}
		else if(B==0){
				return A;
			}
		
		while(B >= 0) {
			
			if ( B == 0 ) {
				return A;
			}
			else
				R = A % B;
				A = B;
				B = R;	
		}
		return B;
		
		
	}
}