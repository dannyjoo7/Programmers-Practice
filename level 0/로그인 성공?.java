package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//로그인 성공?
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "people";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 10, 8, 6 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(s1, s2);
	}
}

class Solution {

	public String solution(String[] id_pw, String[][] db) {
		String answer = "";
		String id = id_pw[0];
		String pw = id_pw[1];

		for (int i = 0; i < db.length; i++) {
			if (db[i][0].equals(id)) {
				if (db[i][1].equals(pw)) {
					answer = "login";
					break;
				} else {
					answer = "wrong pw";
					break;
				}
			} else {
				answer = "fail";
			}
		}

		return answer;
	}
}
