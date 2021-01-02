package Solutions;

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Question4 {

	public Question4() {
		// TODO Auto-generated constructor stub

	}

	void print() {
		System.out.println("OK");
	}

	boolean CheckPalaindrom(int val) {
		int i = 1;
		int sum = 0;
		int pValue = val;

		int lastUnit;

		while (val > 0) {
			lastUnit = val % 10; // getting remainder
			sum = (sum * 10) + lastUnit;
			val = val / 10;
		}

		if (pValue == sum) {
			System.out.println(sum);
			System.out.println("I got u!!");
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question4 object = new Question4();
		object.CheckPalaindrom(5000);
		for (int i = 100; i < 1000; i++) {
			for (int j = 101; j < 1000; j++) {
				int val = i * j;
				boolean status = object.CheckPalaindrom(val);
				if (status == true) {
					System.out.println("The Largest Palaindrm number is " + val);
					
				}
			}
		}
		
	}

}
