import java.util.*;

// 달리기 경주
public class practice {
    public static void main(String[] args) {
        Solution test = new Solution();

        String str = "1D2S#10S";
        String str2 = "6CD";

        String[] s_arr1 = { "mumu", "soe", "poe", "kai", "mine" };
        String[] s_arr2 = { "kai", "kai", "mine", "mine" };
        String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

        int[] arr = { 45, 4, 35, 20, 3, 9 };
        int[] arr2 = { 20, 9, 3, 45, 4, 35 };

        int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

        test.solution(s_arr1, s_arr2);
    }
}

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++){
            int rank = map.get(callings[i]);
            map.put(players[rank], rank - 1);
            swap(players, rank);
            map.put(players[rank], rank);
        }

        return players;
    }
    public void swap(String[] arr, int index) {
        String tmp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = tmp;
    }
}