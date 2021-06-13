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
        if (i < p.length() && j < s.length() && (s.charAt(j) == p.charAt(i) || p.charAt(i) == '.')) {
            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
                isMatcher = isMatch(i, ++j, s, p);
            } else {
                isMatcher = false;
                isMatch(++i, ++j, s, p);
            }
        } else {
            if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
                isMatcher = true;
            } else {
                isMatcher = false;
            }
            isMatch(++i, ++j, s, p);
        }

        return isMatcher;
    }
}
