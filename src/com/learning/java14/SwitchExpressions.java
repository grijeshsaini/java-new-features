package com.learning.java14;

public class SwitchExpressions {

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        var month = Month.OCTOBER;
        System.out.println(getSeason(month));
        System.out.println(getDiscountForMonth(month));
    }

    private static String getSeason(Month month) {
        //No break keyword, cases don’t fall-through
        return switch (month) {
            case  DECEMBER, JANUARY, FEBRUARY -> "Winter";
            case  MARCH, APRIL, MAY -> "Spring";
            case  JUNE, JULY, AUGUST -> "Summer";
            case  SEPTEMBER, OCTOBER, NOVEMBER -> "Autumn";
        };
    }

    private static int getDiscountForMonth(Month month) {
        return switch (month) {
            case  DECEMBER, JANUARY, FEBRUARY -> {
                int monthLength = month.toString().length();
                yield monthLength * 4;
            }
            case  MARCH, APRIL, MAY -> {
                int monthLength = month.toString().length();
                yield monthLength * 2;
            }
            // If all the cases are not covered then default is mandatory.
            default -> 10;
        };
    }

}
