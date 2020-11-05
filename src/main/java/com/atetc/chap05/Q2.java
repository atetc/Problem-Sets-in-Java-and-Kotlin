package com.atetc.chap05;

/**
 * Given a (decimal e.g. 3.72) number that is passed
 * in as a string, print the binary representation. If the number
 * can not be represented accurately in binary, print "ERROR".
 */
public class Q2 {

    public static String printBinary(String n) {
        String[] num = n.split("\\.");
        int integer = Integer.parseInt(num[0]);
        double decimal = Double.parseDouble("0." + num[1]);

        StringBuilder sb = new StringBuilder();
        while (decimal != 0) {
            if (sb.length() > 32) {
                return "ERROR";
            }

            double newDouble = 2 * decimal;
            sb.append(newDouble >= 1 ? "1" : "0");
            decimal = newDouble % 1;
        }

        String intStr = "";
        while (integer != 0) {
            intStr = ((integer & 1) == 1 ? "1" : "0") + intStr;
            integer = integer >> 1;
        }

        return intStr + "." + sb.toString();
    }
}