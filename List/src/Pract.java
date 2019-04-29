import java.util.Scanner;

public class Pract {
	
	public static void main(String[] arg) {
		Scanner scr = new Scanner(System.in); 

		
		String str = scr.nextLine();
		
		char[] chars = str.toCharArray();
		char mat[][] = new char[10][10];
		int i=0,j=0,k=0;
		
		
		for(i=0; i<chars.length;i++) {
			mat[i][j] = chars[i];
			k++;
			if(k==4) {
				j++;
				k =0 ;
			}
		}
		
		k = 0;
		j = 0;
		
		for(i=0; i<=chars.length;i++) {
			System.out.print(mat[i][j]+" ");
			k++;
			if(k==4) {
				System.out.println(" ");
				j++;
				k =0 ;
			}
		}
	}
}
