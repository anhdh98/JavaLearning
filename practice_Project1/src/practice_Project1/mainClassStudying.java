package practice_Project1;
import java.util.Random;

public class mainClassStudying {
	public static void main(String[] args) {
		classStudying test = new classStudying("1020", "TC507");
		
		System.out.println("time: " + test.getTimeAI());
		System.out.println("place: " + test.getPlaceAI());
		System.out.println("So buoi di hoc AI: " + test.getSoBuoiHocAI());
		
	}
}
