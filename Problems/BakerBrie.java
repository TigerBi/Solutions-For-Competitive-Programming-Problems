// Code written by ShuaiBi at Apr 15, 2018
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int o = 0; o < 10; o++) {
			int stores = sc.nextInt();
			int days = sc.nextInt();
			int[][] array = new int[days][stores];
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					array[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			int sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum = 0;
				for(int j = 0; j < array[i].length; j++) {
					sum += array[i][j];
				}
				//System.out.println(sum);
				if(sum % 13 == 0) {
					count += sum/13;
				}
			}
			for(int i = 0; i < stores; i++) {	//controls rows
				sum = 0;
				for(int j = 0; j < days; j++) {	//controls column
					sum += array[j][i];	//rows are always changing, but column is not.
				}
				//System.out.println(sum);
				if(sum % 13 == 0) {
					count += sum/13;
				}
			}
			
			System.out.println(count);
			
		}
	}

}