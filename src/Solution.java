class Solution {
	public long solution(int price, int money, int count) {
		long sum = 0;

		while (count != 0) {
			sum += price * count;
			count--;
		}

		long answer = sum - money;

		return answer > 0 ? answer : 0;
	}
}
