// Code written by ShuaiBi at Apr 7, 2018
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int E = sc.nextInt();
	
		int middle = (B+E)/2;	//Starting from the middle, because it will be the minimal distance
		
		//check for the forward first because it likes more water
		
		int forward = middle;
		int backward = middle;
		while(true) {
			if(isPali(forward)) {
				System.out.println(forward);
				break;
			}else if(isPali(backward)) {
				System.out.println(backward);
				break;
			}
			forward++;
			backward--;
 		}
		
	}
	
	public static boolean isPali(int N) {
		String e = N+"";
		for(int i = 0; i < e.length()/2; i++) {
			char first = e.charAt(i);
			char last = e.charAt(e.length()-i-1);
			if(first != last) {
				return false;
			}
		}
		return true;
	}

}
