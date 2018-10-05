import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainSVPoly {
	public static void main(String[] args) {
		ArrayList<SVPoly> sv = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.print(" Nhap vao so sinh vien cua lop:  ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) );
			SVPoly x = new SVPoly();
			x.setInfor();
			sv.add(x);
		}
		
		System.out.println("\n Danh sach sinh vien: ");
		for(int i = 0; i < n; i++) {
			sv.get(i).getInfor();
		}
		
		
//tim kiem theo khoang diem		
		int a, b;
		System.out.print("\n Khoang diem ban can tim la:\ntu "); 
		a = sc.nextInt();
		System.out.print("den ");
		b = sc.nextInt();
		System.out.println("Danh sach sinh vien trong khoang diem tren:");
		int index = 0;
		for(int i = 0; i < sv.size(); i++) {
			if((a <= sv.get(i).getDiemTB() ) && (sv.get(i).getDiemTB() <= b)){
				sv.get(i).getInfor();
				index++;
			}
		}
		if(index == 0)
			System.out.println("\t Khong co sinh vien nao! ");
		
//tim kiem, sua, xoa theo ten
		System.out.print("\n Nhap ten sinh vien ban muon tim: ");
		String target = sc.next();
		int index1 = 0;
		for(int i = 0; i < sv.size(); i++) {
			if(sv.get(i).getTen().equals(target)) {
				index1++;
				System.out.println("Tim thay " + index + " sinh vien:\nThong tin sinh vien la: ");
				sv.get(i).getInfor();
				System.out.print("Ban co muon sua doi thong tin sinh vien nay? (1/0?): ");
				int sua = sc.nextInt();
				if(sua == 1) {
					SVPoly z = new SVPoly();
					System.out.println("Nhap thong tin moi: ");
					z.setInfor();
					sv.set(i, z);
				}
				System.out.print("Ban co muon xoa thong tin sinh vien nay? (1/0?): ");
				int xoa = sc.nextInt();
				if(xoa == 1) {
					sv.remove(i);
					System.out.println("Da xoa!!!");
				}
			}
		}
		if(index1 == 0) {
			System.out.println("Khong ton tai!!!");
		}
		
		
//Sap xep theo ten,tuoi
		Comparator<SVPoly> comp1 = new Comparator<SVPoly>() {
			@Override
			public int compare(SVPoly o1, SVPoly o2) {
				return (int)(o1.diemTB - o2.diemTB);
			}
		};
		Collections.sort(sv, comp1);
		System.out.println("\n Danh sach sinh vien sau khi sap xep theo diem la: ");
		for(SVPoly l :sv){
				l.getInfor();
		}
		Comparator<SVPoly> comp2 = new Comparator<SVPoly>() {
			@Override
			public int compare(SVPoly o1, SVPoly o2) {
				return o1.getTen().compareTo(o2.getTen());
			}
		};
		Collections.sort(sv, comp2);
		System.out.println("\n Danh sach sinh vien sau khi sap xep theo ten la: ");
		for(SVPoly l :sv){
			l.getInfor();
		}
	}
}
