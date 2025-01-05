package entities;

public class Triangle {
	//atributos
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area(){
		double p = (ladoA + ladoB + ladoC) / 2.0;
		return Math.sqrt(p * (p - ladoA) * (ladoB) * (p - ladoC));
	}
}
 