package di_01;

public class MyCalc {
	private double result = 0.0;

	public void plus(double i) {
		result += i;
	}

	public void minus(double i) {
		result -= i;
	}

	public double getResult() {
		return result;
	}

}
