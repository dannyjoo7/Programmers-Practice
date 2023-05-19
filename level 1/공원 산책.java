import java.util.*;

// 공원 산책
public class practice {
    public static void main(String[] args) {
        Solution test = new Solution();

        String str = "1D2S#10S";
        String str2 = "6CD";

        String[] s_arr1 = {"OSO", "OOO", "OXO", "OOO"};
        String[] s_arr2 = {"E 2", "S 3", "W 1"};
        String[][] s_arr_2 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        int[] arr = {45, 4, 35, 20, 3, 9};
        int[] arr2 = {20, 9, 3, 45, 4, 35};

        int[][] dots = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        test.solution(s_arr1, s_arr2);
    }
}

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int row = park.length;
        int col = park[0].length();

        // map
        int[][] map = new int[row][col];
        info info = new info();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (park[i].charAt(j) == 'S') {
                    info.row = i;
                    info.col = j;
                } else if (park[i].charAt(j) == 'X') {
                    // 장애물 설정
                    map[i][j] = -1;
                }
            }
        }

        for (String r : routes) {
            int move;
            boolean isObstacle = false; // 장애물 여부
            switch (r.charAt(0)) {
                case 'E':
                    r = r.replaceAll("[E ]", "");
                    move = Integer.parseInt(r);

                    // 체크
                    if(info.col + move >= col) break;
                    for (int i = 1; i <= move; i++) {
                        if (map[info.row][info.col + i] == -1) {
                            isObstacle = true;
                            break;
                        }
                    }
                    if (isObstacle) break;
                    else info.col += move;
                    break;

                case 'W':
                    r = r.replaceAll("[W ]", "");
                    move = Integer.parseInt(r);

                    // 체크
                    if (info.col - move < 0) break;
                    for (int i = 1; i <= move; i++) {
                        if (map[info.row][info.col - i] == -1) {
                            isObstacle = true;
                            break;
                        }
                    }
                    if (isObstacle) break;
                    else info.col -= move;
                    break;

                case 'N':
                    r = r.replaceAll("[N ]", "");
                    move = Integer.parseInt(r);

                    // 체크
                    if (info.row - move < 0) break;
                    for (int i = 1; i <= move; i++) {
                        if (map[info.row - i][info.col] == -1) {
                            isObstacle = true;
                            break;
                        }
                    }
                    if (isObstacle) break;
                    else info.row -= move;
                    break;

                case 'S':
                    r = r.replaceAll("[S ]", "");
                    move = Integer.parseInt(r);

                    // 체크
                    if (info.row + move >= row) break;
                    for (int i = 1; i <= move; i++) {
                        if (map[info.row + i][info.col] == -1) {
                            isObstacle = true;
                            break;
                        }
                    }
                    if (isObstacle) break;
                    else info.row += move;
                    break;
            }
        }
        answer[0] = info.row;
        answer[1] = info.col;

        return answer;
    }
}

class info {
    int row;
    int col;
}