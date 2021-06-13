package org.blt.regularexpression;


public class RegularExpression {

    private boolean isMatcher = true;

    public boolean isMatch(String s, String p) {
        if (s.equals("")) s = " ";
        if (!p.contains("*") && !p.contains("."))
            return p.equals(s);
        return isMatch(0, 0, s, p);
    }

    public boolean isMatch(int i, int j, String s, String p) {
        i = i >= s.length() ? s.length() - 1 : i;

        if (j + 1 >= p.length()) {
            if (i == s.length() - 1)
                return isMatcher;
            else
                j = p.length() - 2;
        }

        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            if (p.charAt(j + 1) == '*') {
                isMatcher = true;
                if (i + 1 == s.length())
                    j++;
                isMatch(++i, j, s, p);
            } else {
                isMatcher = true;
                isMatch(++i, ++j, s, p);
            }
        } else {
            if (p.charAt(j + 1) == '*') {
                isMatcher = true;
                isMatch(i, j + 1, s, p);
            } else {
                isMatcher = false;
            }
        }
        return isMatcher;
    }
}
