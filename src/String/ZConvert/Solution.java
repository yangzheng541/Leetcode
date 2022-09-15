package String.ZConvert;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "A";
        int numRows = 1;
        System.out.println(convert(s, numRows));
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] s_row = new String[numRows];
        Arrays.fill(s_row, "");
        for (int i = 0; i < s.length(); i++) {
            int tmp = i % (2 * numRows - 2);
            int row_number = tmp < numRows ? tmp : 2 * numRows - 2 - tmp;
            s_row[row_number] = s_row[row_number] + s.charAt(i);
        }
        StringBuilder result = new StringBuilder();
        for (String row : s_row) {
            result.append(row);
        }
        return result.toString();
    }
}
