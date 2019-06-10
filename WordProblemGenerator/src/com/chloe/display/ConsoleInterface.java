package com.chloe.display;

import com.chloe.util.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInterface implements Interface{
    private static ConsoleInterface instance = new ConsoleInterface();

    Scanner scanner = new Scanner(System.in);

    private ConsoleInterface() { }

    public static ConsoleInterface getInstance() {
        return instance;
    }

    @Override
    public ArrayList<String> getInformation() {
        String input = "init";
        ArrayList<String> inputs = new ArrayList<>();

        while(true) {
            input = scanner.nextLine();
            if (input.equals(Utility.QUIT)) break;

            inputs.add(input);
        }

        return inputs;
    }

    @Override
    public int getNumOfProblem() {
        System.out.print(Utility.WRITE_NUM_OF_PROBLEM);

        int numOfProblem = scanner.nextInt();
        return numOfProblem;
    }


    @Override
    public void printScore(double score) {
        System.out.println("\n" + Utility.SCORE + Double.toString(score) + "\n");
    }

    @Override
    public double getAnswer() {
        double answer = scanner.nextDouble();
        return answer;
    }

    @Override
    public boolean moreWorkSheet() {
        System.out.print(Utility.ASK_MORE_WORKSHEET);
        scanner.nextLine();
        String input = scanner.nextLine();

        return Utility.NO.contains(input);
    }

}
