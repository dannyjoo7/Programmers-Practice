import java.util.*;

// 과제 진행하기
public class practice {
    public static void main(String[] args) {
        Solution test = new Solution();

        String str = "1D2S#10S";
        String str2 = "6CD";

        String[] s_arr1 = {"diamond", "iron", "iron", "iron", "iron", "diamond", "diamond", "iron", "iron", "iron"};
        String[] s_arr2 = {"E 2", "S 3", "W 1"};
        String[][] s_arr_2 = {{"A", "12:00", "30"}, {"B", "12:10", "20"}, {"C", "15:00", "40"}, {"D", "15:10", "30"}};

        int[] arr = {0, 1, 0};
        int[] arr2 = {20, 9, 3, 45, 4, 35};

        int[][] dots = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        test.solution(s_arr_2);
    }
}

class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        ArrayList<Info> arr = new ArrayList<>();
        Stack<Info> stack = new Stack<>();

        // 리스트에 값 삽입...
        for (String[] s : plans) {
            String[] time = s[1].split(":");
            arr.add(new Info(s[0], Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]), Integer.parseInt(s[2])));
        }
        arr.sort((Info i1, Info i2) -> i1.getStart_time() - i2.getStart_time());

        // 스케줄링 시작...
        int index = 0;
        Info curSubject = arr.get(0);
        for (int i = arr.get(0).getStart_time(); ; i++) {
            // 수행 시간 종료...
            if (curSubject.remaining_time == 0) {
                arr.remove(curSubject);
                if (stack.empty() && !arr.isEmpty()) {
                    answer[index++] = curSubject.name;
                    curSubject = arr.get(0);
                    i = curSubject.start_time;
                } else if (!stack.empty()) {
                    answer[index++] = curSubject.name;
                    curSubject = stack.peek();
                    stack.pop();
                } else if (stack.empty() && arr.isEmpty()) {
                    answer[index++] = curSubject.name;
                    break;
                }
            }

            // 다음 스케줄 확인...
            if (arr.indexOf(curSubject) + 1 < arr.size() && arr.get(arr.indexOf(curSubject) + 1).start_time == i) {
                stack.push(curSubject);
                curSubject = arr.get(arr.indexOf(curSubject) + 1);
                curSubject.remaining_time--;
                continue;
            }

            // 시간 감소...
            curSubject.remaining_time--;

            // 종료인지 확인...
            if (stack.empty() && arr.isEmpty()) break;
        }

        return answer;
    }
}

class Info {
    String name;
    int start_time;

    int remaining_time;

    public int getStart_time() {
        return start_time;
    }

    Info(String _name, int _start_time, int _remaining_time) {
        this.name = _name;
        this.start_time = _start_time;
        this.remaining_time = _remaining_time;
    }
}