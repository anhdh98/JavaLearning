import java.util.Scanner;

public class SVPoly {
	public String hoTen;
	public double diemTB;
	
	public void setInfor() {
		System.out.print("Ho ten: ");
		hoTen = new Scanner(System.in).nextLine();
		System.out.print("Diem trung binh: ");
		diemTB = new Scanner(System.in).nextDouble();
	}
	public String getTen() {
		return hoTen;
	}
	public double getDiemTB(){
		return diemTB;
	}
	public void getInfor() {
		System.out.println("Ho ten: " + hoTen + " \t\tDiem TB: " + diemTB);
	}
}