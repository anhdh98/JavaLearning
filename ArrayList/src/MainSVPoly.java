import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSVPoly {
	public static void main(String[] args) {
		ArrayList<SVPoly> sv = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so sinh vien cua lop:  ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) );
			SVPoly x = new SVPoly();
			x.setInfor();
			sv.add(x);
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin sinh vien thu " + (i+1));
			sv.get(i).getInfor();
			
		}
		int a, b;
		System.out.print("Khoang diem ban can tim la:\n tu "); 
		a = sc.nextInt();
		System.out.print(" den ");
		b = sc.nextInt();
		System.out.println("Danh sach sinh vien trong khoang diem tren:");
		int index = 0;
		for(int i = 0; i < sv.size(); i++) {
			if((a <= sv.get(i).getDiemTB() ) && (sv.get(i).getDiemTB() <= b)){
				System.out.println("");
				sv.get(i).getInfor();
				System.out.println();
				index++;
			}
		}
		if(index == 0)
			System.out.println("\t Khong co sinh vien nao! ");
		/*Comparator<SVPoly> comp = new Comparator<SVPoly>(){
			@Override
			public int compare(SVPoly p1, SVPoly p2) {
				return p1.getDiemTB().compareTo(p2.getDiemTB());
			}
		};
		Collections.sort(sv, comp);*/
	}
}
