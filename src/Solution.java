//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
class Solution {
	public boolean solution(int x) {
		boolean answer = true;

		int sum = 0;
		int TF = x;

		while (x >= 1) {
			sum += TF % 10;
			TF /= 10;
		}

		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}

	}
}
