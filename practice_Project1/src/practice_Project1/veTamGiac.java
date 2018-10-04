package practice_Project1;

import java.util.Random;
import java.util.Scanner;

public class veTamGiac {
	public static void main(String[] args) {
		int h;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Moi nhap chieu cao h (2 <= h <= 10) cua tam giac: ");
			h = sc.nextInt();
			if(h <2 || h > 10) 
					System.out.println("chieu cao khong thoa man dieu kien");
		}while(h < 2 || h >10);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < (h + i); j++) {
				if(j < h - i - 1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");	
		}
		Random rd = new Random();
		System.out.println(rd.nextInt(30));
	}
}
