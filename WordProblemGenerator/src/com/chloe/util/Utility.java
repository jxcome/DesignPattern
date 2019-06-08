package com.chloe.util;

public class Utility {
    public static final String Q_MEAN = "q 입력시 입력이 종료됩니다. \n";
    public static final String QUIT = "q";

    public static final String WRITE_PERSON = "자녀에게 중요한 사람들의 이름을 입력하세요.\n";
    public static final String WRITE_PRODUCT = "자녀에게 중요한 물품들을 입력하세요.\n";

    public static final int SUM = 0;
    public static final int SUB = 1;
    public static final int MUL = 2;
    public static final int DIV = 3;

    public static final String[][] OLD_STRINGS = {
            {"#person1", "Person"}, {"#product", "Product"},
            {"#value1", "Value"}, {"#person2", "Person"},
            {"#value2", "Value"}};

    public static final String[] SUM_TEPLATES = {
            "#person1은 #product을 #value1 가지고 있습니다. #person2은 #product을 #value2개 가지고 있습니다." +
                    "그들이 가지고 있는 #product은 모두 몇 개 입니까?"
    };
}
