package org.blt.regularexpression;


public class RegularExpression2 {
    boolean isMatcher = true;
    boolean loop = true;
    int d = 0;

    public boolean isMatch(String s, String p) {
        if (s.equals("")) s = " ";
        if (!p.contains("*") && !p.contains("."))
            return p.equals(s);
        return isMatch(0, 0, s, p);
    }

    public boolean isMatch(int i, int j, String s, String p) {
        System.out.println(++d);
        if (loop){
            i = i + 1 < p.length() ? i + 1 : i;
            j = j + 1 < s.length() ? j + 1 : j;
            if (i + 1 < p.length() || j + 1 < s.length()) {
                isMatch(i, j, s, p);
            }
        }
        loop = false;

//        if (j+1 < s.length()) {
//            isMatch(i, ++j, s, p);
//        }
//        if (i+1 < p.length()) {
//            isMatch(++i, j, s, p);
//        }
        if (j > 0 && (s.charAt(j) == p.charAt(i) || p.charAt(i) == '.')) {
            isMatcher = isMatcher & true;
        } else {
            if (p.charAt(i) == '*') {
                if (j >= 0 && (p.charAt(i - 1) == '.' || p.charAt(i - 1) == s.charAt(j))) {
                    isMatcher = isMatcher & true;
                    isMatch(i, j-1, s, p);
                }
                else {
                    if (j>=0){
                        isMatcher = isMatcher & false;
                        isMatch(i-1, j, s, p);
                    }
                }
            } else {
                isMatcher = isMatcher & false;
            }
        }

        return isMatcher;
    }
}
