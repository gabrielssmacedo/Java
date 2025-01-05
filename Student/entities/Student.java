package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	public double scoreMedia;
	
	
	public void calculeScoreMedia() {
		scoreMedia = (n1 + n2 + n3);
	}
	
	public String isPass() {
		if(scoreMedia >= 60.00) return "\nPASS";
		else return "\nFAILED\n" +
					"MISSING " +
					String.format("%.2f", 60.00 - scoreMedia) +
					" POINTS";
	}
}
