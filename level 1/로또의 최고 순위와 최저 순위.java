package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;
import java.util.ArrayList;

// 로또의 최고 순위와 최저 순위
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "1D2S#10S";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 45, 4, 35, 20, 3, 9 };
		int[] arr2 = { 20, 9, 3, 45, 4, 35 };

		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(arr, arr2);
	}
}

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		int cnt = 0, zeroCnt = 0;
		int max, min;
		ArrayList<Integer> mynum = convertArrayToList(lottos);
		mynum.sort(null);
		ArrayList<Integer> win = convertArrayToList(win_nums);
		win.sort(null);

		for (int i = 0; i < mynum.size(); i++) {
			if (mynum.get(i) == 0) {
				mynum.remove(i);
				zeroCnt++;
				i--;
			} else {
				break;
			}
		}

		for (int i = 0; i < win.size(); i++) {
			for (int j = 0; j < mynum.size(); j++) {
				if (win.get(i) == mynum.get(j)) {
					cnt++;
					mynum.remove(j);
					win.remove(i);
					i--;
					break;
				}
			}
		}
		max = cnt + zeroCnt;
		min = cnt;

		answer = matchRank(max, min);

		return answer;
	}

	public ArrayList<Integer> convertArrayToList(int[] arr) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			tmp.add(arr[i]);
		}

		return tmp;
	}

	public int[] matchRank(int max, int min) {
		int[] tmp = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(6, 1);
		map.put(5, 2);
		map.put(4, 3);
		map.put(3, 4);
		map.put(2, 5);
		map.put(1, 6);
		map.put(0, 6);
		tmp[0] = map.get(max);
		tmp[1] = map.get(min);

		return tmp;
	}
}
