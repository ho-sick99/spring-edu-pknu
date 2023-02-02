import java.util.ArrayList;
import java.util.Random;

public class MyLotto {
	private ArrayList<Integer> lottoNums = new ArrayList<Integer>();

	public void makeLotto() {
		Random random = new Random();

		while (lottoNums.size() < 6) { // 6개의 숫자
			int num = random.nextInt(45) + 1; // range: 1 ~ 45
			if (!lottoNums.contains(num)) { // 중복되지 않을 경우
				lottoNums.add(num); // push
			}
		}
	}

	public ArrayList<Integer> getLotto() {
		return lottoNums;
	}
}
