import java.util.Scanner;

public class Shift {
	public static void main(String[] arg) {
		char s_arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char b_arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String str;
		Scanner src = new Scanner(System.in);
		str = src.nextLine();
		char[] enc_chars = new char[50];
		char[] raw_chars = str.toCharArray();
		int i=0,j=0;
		for(i=0; i<raw_chars.length;i++) {
			for(j=0;j<26;j++) {
				if(raw_chars[i] == s_arr[j]) {
					enc_chars[i] = s_arr[(j+7)%26];
				}
				if(raw_chars[i] == b_arr[j]) {
					enc_chars[i] = b_arr[(j+7)%26];
				}
			}
			 
		}
		System.out.println(enc_chars);
	}
}
