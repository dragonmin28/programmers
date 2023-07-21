import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(s -> {
            String[] arr = s.trim().split(" ");
            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }).toArray(String[]::new);
    }
}