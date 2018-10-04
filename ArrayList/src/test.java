import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		int tong = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		for(int i = 0; i < a.size(); i++) {
			Integer x = a.get(i);
			tong += x; 
		}
		System.out.println("Tong cua mang la: " + tong);
		String name = new String();
		System.out.println(name);
	}
}
