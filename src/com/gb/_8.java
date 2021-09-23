package com.gb;
public class _8 {
    public static void main(String[] args) {
        int year = 2020;
        boolean leapYear = false;
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
            leapYear = true;
        System.out.println(year + " високосный? - " + leapYear);
    }
}
