package leetcode;

/**
 * Created by Administrator on 2015/11/3.
 */
public class LPS {
    public static void main(String[] args) {

        System.out.println(longestPd("abccba"));

    }

    public static String longestPalindrome(String s) {
        System.out.println(s);
        if (s.length() == 0 || s.length() == 1)
            return s;
        int i = 0;
        int j;
        int maxi;
        int maxj;
        int k = s.length() - 1;
        while (i <= k) {
            j = k;
            while (s.charAt(i) != s.charAt(j)) {
                j--;
            }
            if (i == j) {
                i++;
                continue;
            } else {
                maxi = i;
                maxj = j;
                while (s.charAt(i) == s.charAt(j) && i < j) {
                    i++;
                    j--;
                }

                if (i < j) {
                    return longestPalindrome(s.substring(i, j + 2));
                } else {
                    return s.substring(maxi, maxj + 1);
                }
            }

        }

        return null;
    }

    public static String longestPd(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int maxLen = 0;
        String longestStr = null;
        boolean[][] table = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            table[i][i] = true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                longestStr = s.substring(i, i + 2);
            }
        }

        for (int l = 3; l <= s.length(); l++) {
            for (int i = 0; i < s.length() - l + 1; i++) {
                int j = i + l - 1;
                System.out.println(i + " " + j);
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] == true)
                        longestStr = s.substring(i, j + 1);
                    else {
                        table[i][j] = false;
                    }
                }
            }

        }

        return longestStr;

    }
}
