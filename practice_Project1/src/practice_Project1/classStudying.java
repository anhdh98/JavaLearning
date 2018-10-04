package practice_Project1;

import java.util.Random;

public class classStudying {
	private String timeAI;
	private String placeAI;
	private static int soBuoiHocAI;
	
	Random rd = new Random();
	public classStudying(){
		timeAI 	= "0630";
		placeAI = "TC407";
		soBuoiHocAI = rd.nextInt(30);
	}
	public classStudying(String timeAI, String placeAI) {
		this.timeAI = timeAI;
		this.placeAI = placeAI;
		soBuoiHocAI = rd.nextInt(30);
	}
	
	public String getTimeAI() {
		return timeAI;
	}
	public String getPlaceAI() {
		return placeAI;
	}
	public int getSoBuoiHocAI() {
		return soBuoiHocAI;
	}
}

