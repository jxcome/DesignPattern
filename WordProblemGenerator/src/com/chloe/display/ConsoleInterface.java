package com.chloe.display;

import com.chloe.util.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInterface implements Interface{
    // 인풋을 받고
    // 계산결과를 출력
    private static ConsoleInterface instance = new ConsoleInterface();

    private ConsoleInterface() { }

    public static ConsoleInterface getInstance() {
        return instance;
    }

    @Override
    public ArrayList<String> getInformation() {
        String input = "init";
        ArrayList<String> inputs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            input = scanner.nextLine();
            if (input.equals(Utility.QUIT)) break;

            inputs.add(input);
        }

        return inputs;
    }

    @Override
    public void printResult() {

    }

}
