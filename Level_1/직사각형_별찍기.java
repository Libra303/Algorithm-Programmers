package Level_1;

import java.util.Scanner;

public class 직사각형_별찍기 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        for(int i = 0; i < row; i++) {
        	
        	for(int j = 0; j < col; j++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }

	}//main

}
