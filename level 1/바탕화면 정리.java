import java.util.*;

// 바탕화면 정리
public class practice {
    public static void main(String[] args) {
        Solution test = new Solution();

        String str = "1D2S#10S";
        String str2 = "6CD";

        String[] s_arr1 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] s_arr2 = {"E 2", "S 3", "W 1"};
        String[][] s_arr_2 = {{"A", "12:00", "30"}, {"B", "12:10", "20"}, {"C", "15:00", "40"}, {"D", "15:10", "30"}};

        int[] arr = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] arr2 = {20, 9, 3, 45, 4, 35};

        int[][] dots = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        test.solution(s_arr1);
    }
}

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int row = wallpaper.length;
        int col = wallpaper[0].length();

        ArrayList<locate> info = new ArrayList<>();

        // 값 넣기...
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(wallpaper[i].charAt(j) == '#') info.add(new locate(i, j));
            }
        }

        // 점 찾기...
        int lux = info.get(0).start_row;
        int luy = info.get(0).start_col;
        int rdx = info.get(0).end_row;
        int rdy = info.get(0).end_col;

        for(locate l : info){
            if(l.start_row < lux) lux = l.start_row;
            if(l.start_col < luy) luy = l.start_col;
            if(l.end_row > rdx) rdx = l.end_row;
            if(l.end_col > rdy) rdy = l.end_col;
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;

        return answer;
    }
}

class locate{
    int start_row;
    int start_col;
    int end_row;
    int end_col;

    locate(int row, int col){
        this.start_row = row;
        this.start_col = col;
        this.end_row = row + 1;
        this.end_col = col + 1;
    }
}