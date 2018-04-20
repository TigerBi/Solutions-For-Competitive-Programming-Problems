// Code written by ShuaiBi at Apr 3, 2018
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int k = 0; k < N; k++) {
			int amount = sc.nextInt();
			Stack<Integer> mountain = new Stack<>();
			Stack<Integer> branch = new Stack<>();
			Stack<Integer> lake = new Stack<>();
			for(int i = 0; i < amount; i++) {
				mountain.add(sc.nextInt());
			}
			int need = 1;
			boolean isPossible = true;
			while(true) {
				
				//System.out.println(mountain.size());
				if(!mountain.isEmpty() && mountain.peek() == need) {
					lake.add(mountain.pop());
					need++;
				}else if(!branch.isEmpty() && branch.peek() == need) {
					lake.add(branch.pop());
					need++;
				}else if(!mountain.isEmpty() && mountain.peek() != need){
					//System.out.println("imhere");;
					branch.add(mountain.pop());
				}
				
				if(mountain.isEmpty()) {
					break;
				}
			}
			while(!branch.isEmpty()) {
				if(branch.peek() == need) {
					//System.out.println(need);
					lake.add(branch.pop());
					need++;
				}else {
					break;
				}
			}
			
			if(lake.size() == amount) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}

}