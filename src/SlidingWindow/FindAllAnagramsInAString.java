package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        int[] countP = new int[26];
        int[] countW = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            // thêm ký tự mới vào window
            countW[s.charAt(i) - 'a']++;

            // nếu window quá k, bỏ ký tự cũ
            if (i >= k) {
                countW[s.charAt(i - k) - 'a']--;
            }

            // nếu window đủ k ký tự
            if (i >= k - 1) {
                if (Arrays.equals(countP, countW)) {
                    res.add(i - k + 1);
                }
            }
        }

        return res;
    }
}
