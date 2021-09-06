// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 
// 리턴하는 함수, solution을 완성해주세요. 
// 단, 리턴하려는 배열이 빈 배열인 경우엔 
// 배열에 -1을 채워 리턴하세요.
class Solution {
	public int[] solution(int[] arr) {
		// 배열이 비었을 경우
		if (arr.length <= 1) {
			int[] answer = { -1 };
			return answer;
		}

		int[] answer = new int[arr.length - 1];

		// 기준값
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}

		// 반복문 index 용도
		int index = 0;

		// 가장 작은 수를 제외한 배열 만들기
		for (int i = 0; i < arr.length; i++) {
			// 배열의 값이 최소값이랑 같으면 넘어가기
			if (arr[i] == min) {
				continue;
			}

			answer[index++] = arr[i];
		}

		return answer;
	}
}