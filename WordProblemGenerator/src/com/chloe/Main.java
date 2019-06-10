package com.chloe;

import com.chloe.util.Utility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean moreWorkSheet = true;
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        while(moreWorkSheet) {
            // 진행


            System.out.print(Utility.ASK_MORE_WORKSHEET);
            String input = scanner.nextLine();

            moreWorkSheet = Utility.YES.contains(input);

        }
    }
}
