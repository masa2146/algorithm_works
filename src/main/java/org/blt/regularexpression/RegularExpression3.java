package org.blt.regularexpression;


public class RegularExpression3 {

    public boolean isMatch(String s, String p) {
        boolean isMatch = false;
        StringBuilder expect = new StringBuilder();
        int size = p.length(), i = 0, j = 0;

        if (p.contains("*")) {
            while (i < size) {
                if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
                    if (j < s.length()) {
                        if ((p.charAt(i) == s.charAt(j) || p.charAt(i) == '.')) {
                            expect.append(s.charAt(j));
                            j++;
                        } else {
                            i++;
                        }
                    } else {
                        i++;
                    }
                } else {
                    if (j < s.length()) {
                        if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '.') {
                            expect.append(s.charAt(j));
                            j++;

                        } else {
                            if (p.charAt(i) != '*') {
                                expect.append(p.charAt(i));
                            }
                        }
                    } else {
                        if (expect.length() > 1) {
                            if (s.charAt(s.length()-1) != p.charAt(i) && p.charAt(i) != '*' ) {
                                expect.append(p.charAt(i));
                            }
                        } else if (expect.length() == 1) {
                            if (p.charAt(i) != '*') {
                                expect.append(p.charAt(i));
                            }
                        }
                    }
                    i++;
                }
            }
            isMatch = expect.toString().equals(s);
        } else {
            if (!p.contains(".")) {
                isMatch = s.equals(p);
            } else {
                while (i < size) {
                    if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '.') {
                        expect.append(s.charAt(j));
                    }
                    j++;
                    i++;
                }
                isMatch = expect.toString().equals(s);
            }
        }
//        System.out.println(expect.toString());

        return isMatch;
    }
}
