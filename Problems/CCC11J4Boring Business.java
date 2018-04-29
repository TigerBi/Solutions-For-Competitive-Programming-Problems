// Code written by ShuaiBi at Apr 20, 2018
import java.io.*;
import java.util.*;

public class Main {
	public class Coordinate {
		int x, y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int curX = -1;
		int curY = -5;
		
		ArrayList<Integer> Xs = new ArrayList<>();
		ArrayList<Integer> Ys = new ArrayList<>();
		
		Xs.add(curX);
		Ys.add(curY);
		
		Xs.add(0); Ys.add(-1); Xs.add(0); Ys.add(-2); Xs.add(0); Ys.add(-3); Xs.add(1); Ys.add(-3); Xs.add(2); Ys.add(-3); Xs.add(3); Ys.add(-3); Xs.add(3); Ys.add(-4); Xs.add(3); Ys.add(-5); Xs.add(4); Ys.add(-5); Xs.add(5); Ys.add(-5); Xs.add(5); Ys.add(-4);  Xs.add(5); Ys.add(-3); Xs.add(6); Ys.add(-3); Xs.add(7); Ys.add(-3); Xs.add(7); Ys.add(-4); Xs.add(7); Ys.add(-5); Xs.add(7); Ys.add(-6); Xs.add(7); Ys.add(-7); Xs.add(6); Ys.add(-7); Xs.add(5); Ys.add(-7); Xs.add(4); Ys.add(-7); Xs.add(3); Ys.add(-7); Xs.add(2); Ys.add(-7); Xs.add(1); Ys.add(-7); Xs.add(0); Ys.add(-7); Xs.add(-1); Ys.add(-7);   Xs.add(-1); Ys.add(-6); Xs.add(-1); Ys.add(-5);        
		
		while(true) {
			char c = sc.next().charAt(0);
			int number = sc.nextInt();
			if(c == 'q') {
				break;
			}
			int operation = 0;	//d 0 u 1 l 2 r 3
			switch(c) {
			case 'd':
				operation = 0;
				break;
			case 'u':
				operation = 1;
				break;
			case 'l':
				operation = 2;
				break;
			case 'r':
				operation = 3;
				break;
			}
			
			boolean isDanger = false;
			for(int o = 0; o < number; o++) {
				if(operation == 0) {
					curY--;
				}else if(operation == 1) {
					curY++;
				}else if(operation == 2) {
					curX--;
				}else if(operation == 3) {
					//System.out.println();
					curX++;
				}
				
				for(int i = 0; i < Xs.size(); i++) {
					if(Xs.get(i) == curX && Ys.get(i) == curY) {
						isDanger = true;
						break;
					}
				}
				
				Xs.add(curX);
				Ys.add(curY);
	
			}
			
			
			if(isDanger) {
				System.out.println(curX+" "+curY+" DANGER");
				return;
			}else {
				System.out.println(curX+" "+curY+" safe");
			}

			

		}
		
	}

}