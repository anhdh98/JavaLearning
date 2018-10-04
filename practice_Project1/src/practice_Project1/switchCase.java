package practice_Project1;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap Nam: ");
		int nam = sc.nextInt();
		System.out.println("moi nhap Thang: ");
		int thang = sc.nextInt();
		switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Thang " + thang + " nam " + nam + " co 31 ngay"); break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Thang " + thang + " nam " + nam + " co 30 ngay"); break;
			case 2:
				if(((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)) 
					System.out.println("Thang 2 nam " + nam + " co 29 ngay");
				else System.out.println("Thang 2 nam " + nam + " co 28 ngay");
			break;
		}
	}

}
