/*Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.
Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
Constraints:
1 <= k <= num.length <= 105
num consists of only digits.
num does not have any leading zeros except for the zero itself. */
public class Remove_K_Digits_402 {
    public String removeKdigits(String num, int k) {
        String a = "0";
        if (num.length() == k) return a;
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < num.length(); j++) {
            char c = num.charAt(j);
            if (sb.length() == 0) sb.append(c);
            else if (sb.charAt(sb.length() - 1) - '0' > c - '0' && k != 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
                j--;
            } else sb.append(c);
        }
        
        while (k != 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        if (sb.length() == 0) return a;
        return sb.toString();
    }
}
