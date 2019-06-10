package com.chloe;

import com.chloe.display.ConsoleInterface;
import com.chloe.information.Information;
import com.chloe.information.PersonInformation;
import com.chloe.information.ProductInformation;
import com.chloe.util.Utility;
import com.chloe.workSheet.Problem;
import com.chloe.workSheet.WorkSheet;
import com.chloe.workSheet.operator.Operator;
import com.chloe.workSheet.operator.OperatorFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        boolean moreWorkSheet = true;
        Scanner scanner = new Scanner(System.in);
        ConsoleInterface display = ConsoleInterface.getInstance();

        Student student = new Student();

        while(moreWorkSheet) {
            // 진행
            Information information = new PersonInformation(new ProductInformation());
            information.setInformation();
            OperatorFactory operatorFactory = new OperatorFactory(information);

            System.out.print(Utility.WRITE_OPERATOR + Utility.Q_MEAN);
            ArrayList<String> operations = display.getInformation();
            ArrayList<Problem> workSheet = new ArrayList<>();
            int numOfProblem = display.getNumOfProblem();

            int eachOperator = numOfProblem / operations.size();

            for (String type: operations) {
                for (int i = 0; i < eachOperator; i++) {
                    Operator operator = operatorFactory.createOperator(type);
                    workSheet.add(operator.createWP());
                }
            }

            student.enrollWorkSheet(new WorkSheet(workSheet));
            student.solveWorkSheet();

            display.printScore(((double)student.getLastScore() / (double)numOfProblem) * 100.0);
            moreWorkSheet = display.moreWorkSheet();
        }
    }
}
