
public class NhanVien {
	private String tenNhanVien; 
	private double luongCoBan;
	private double heSoLuong;
	public final double Luong_MAX = 1000d;
	public double Luong() {
		double Luong;
		Luong = luongCoBan * heSoLuong;
		return Luong;
	}
	
	public boolean tangLuong (double n) {
		if(luongCoBan*(n + heSoLuong) > Luong_MAX)
				return false;
		else return true;
	}
	
	public void inTTin() {
		System.out.println("ten: " + tenNhanVien);
		System.out.println("luongNhanvien: " + Luong());
	}
	
	public void setTen(String ten) {
		this.tenNhanVien = ten; 
	}
	public String getTen() {
		return this.tenNhanVien;
	}
	
	public void setLuong(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getLuong() {
		return this.luongCoBan;
	}
	
	public void setHeSoLuong(double x) {
		this.heSoLuong = x; 
	}
	public double getHeSoLuong() {
		return this.heSoLuong;
	}
}