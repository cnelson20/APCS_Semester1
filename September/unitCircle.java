import java.util.Random;

public class unitCircle {
	public static void main (String[] args) {
		if (args[1].equals("--pi")) {
			System.out.println(ratioOfPoints(Integer.parseInt(args[0]))*4);
		} else {	
			System.out.println(ratioOfPoints(Integer.parseInt(args[0])));
		}
	}
	public static boolean isInsideUnitCircle(double x,double y) {
		return (x * x) + (y * y) < 1;
	}
	public static double ratioOfPoints(int howManyTimes) {
		//System.out.println("Times: " +  howManyTimes);
		int nInsideCircle = 0;
		double x;
		double y;
		Random rand = new Random();
		for  (int i = 0; i < howManyTimes; i++) {
			x = rand.nextDouble();
			y = rand.nextDouble();
			//System.out.println(x + "," + y);
			if (isInsideUnitCircle(x,y)) {nInsideCircle++;}
		}
		return nInsideCircle / (howManyTimes * 1.0);
	}
}

//The result is an estimation of Pi so it should be around 3.14

