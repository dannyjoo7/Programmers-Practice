package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 폰켓몬
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 3, 3, 2, 2, 4 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(arr);
	}
}

class Solution {
	public int solution(int[] nums) {
		int cnt = 0;
		int n = nums.length / 2;
		HashMap<Integer, Integer> map = new HashMap<>();

		if (nums.length == 1) {
			return 1;
		}

		for (int i = 0; i < nums.length; i++) {
			int curnum = nums[i];
			if (map.get(curnum) == null) {
				map.put(curnum, 1);
				cnt++;
				continue;
			}
			int key = map.get(curnum);
			map.put(curnum, key + 1);
		}
		if (cnt >= n) {
			return n;
		} else {
			return cnt;
		}
	}
}
