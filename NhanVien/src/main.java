import java.util.Random;

public class main {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien();
		NV1.setTen ("Dung");
		NV1.setLuong(100);
		NV1.setHeSoLuong(3);
		NV1.inTTin();
		Random rd = new Random();
		System.out.println(rd.nextInt(30));
	}
}
