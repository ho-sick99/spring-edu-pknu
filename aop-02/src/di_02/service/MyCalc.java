package di_02.service;

public class MyCalc {
	private double res = 0;

	public double plus(double i) {
		res += i;
		return res;
	}

	public double multiple(double i) {
		res *= i;
		return res;
	}

	public double minus(double i) {
		res -= i;
		return res;
	}

	public double getResult() {
		return res;
	}

}
