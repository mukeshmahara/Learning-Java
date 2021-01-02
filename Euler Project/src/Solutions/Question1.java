package Solutions;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.

public class Question1 {

	public Question1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int sum=0;
		for(int i=0;i<1000;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		System.out.println("the sum of multiple of 3 or 5 is "+sum);
	}

}
