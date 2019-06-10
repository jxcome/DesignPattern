package com.chloe.util;

import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
    public static final String Q_MEAN = "q 입력시 입력이 종료됩니다. \n";
    public static final String QUIT = "q";

    public static final String WRITE_PERSON = "자녀에게 중요한 사람들의 이름을 입력하세요.\n";
    public static final String WRITE_PRODUCT = "자녀에게 중요한 물품들을 입력하세요.\n";
    public static final String WRITE_OPERATOR = "연산자의 종류를 입력하세요\n";
    public static final String WRITE_NUM_OF_PROBLEM = "문제 개수를 입력하세요\n";

    public static final String START = "------------문제 풀이를 시작합니다.----------\n";
    public static final String WRITE_ANWSER = "정답을 입력하세요 > ";

    public static final String SCORE = "총 점수 = ";

    public static final String ASK_MORE_WORKSHEET = "프로그램을 종료하겠습니까? Y/N\n";

    public static final ArrayList<String> YES = new ArrayList<>(
            Arrays.asList("Y", "y")
    );
    public static final ArrayList<String> NO = new ArrayList<>(
            Arrays.asList("N", "n")
    );

    public static final String SUM = "+";
    public static final String SUB = "-";
    public static final String MUL = "*";
    public static final String DIV = "/";

//    public static final int SUM = 0;
//    public static final int SUB = 1;
//    public static final int MUL = 2;
//    public static final int DIV = 3;

    public static final String[][] OLD_STRINGS = {
            {"#person1", "Person"}, {"#product", "Product"},
            {"#value1", "Value"}, {"#person2", "Person"},
            {"#value2", "Value"}};

    public static final String[] SUM_TEPLATES = {
            "#person1은 #product을 #value1 가지고 있습니다. #person2은 #product을 #value2개 가지고 있습니다." +
                    "그들이 가지고 있는 #product은 모두 몇 개 입니까?"
    };

    public static final String[] SUB_TEPLATES = {
            "#person1은 #product을 #value1개 가지고 있습니다. #person2은 #person1에게 #product #value2개를 주었습니다." +
                    "#person1에게 몇 개의 #product가 남았습니까?"
    };

    public static final String[] MUL_TEPLATES = {
            "#person1은 #value1개의 #product을 #value2 묶음 가지고 있습니다. #person1은 전부 #product이 몇 개입니까?"
    };

    public static final String[] DIV_TEPLATES = {
            "#person1은 #product을 #value1개 가지고 있습니다. 그는 #value2의 친구에게 똑같이이 나누어 주고 싶습니다." +
                    "각각은 몇 개씩 가지게 되나요?"
    };
}
