package com.chloe;

/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class CardInteraction {
    private Scanner scanner;
    private CardOrder card;

    public CardInteraction() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        card = new CardOrder(getNameFromUser());

        printSampleCard();
    }

    /**
     * 사용자에게 포맷에 맞는 이름을 입력 요청
     */
    private void printSampleCard() {
        System.out.print("\n" + Constants.SAMPLE_CARD + "\n\n");
        System.out.print(card.getSampleCard() + "\n\n");
        System.out.print(Constants.USER_RESOPNSE);

        String response = "";
        response = scanner.nextLine();

        if (response.equals(Constants.RESPONSE_OK)) {
            card.setNumCards(getNumberFromUser());
            card.getFinalCost();
        }
        else {
            card.setBorder(response.charAt(0));
            printSampleCard();
        }
    }


    /**
     * 명함에 인쇄될 이름을 사용자에게 입력 요청
     *
     * @return 입력받은 이름
     */
    private String getNameFromUser() {
        System.out.print(Constants.ENTER_NAME);

        String fullName =  "";
        fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        if((names.length == 1) || (fullName.length() > 28)) {
            System.out.print(Constants.NAME_ERROR_MSG + "\n\n");
            return getNameFromUser();
        }

        return fullName;
    }

    /**
     * 주문할 명함의 수량 입력 요청
     *
     * @return 입력받은 수량
     */
    private int getNumberFromUser() {
        System.out.print("\n" + Constants.CARD_NUM);

        int numOfCard;
        while (true) {

            // 정수가 아닌 입력이 들어온 경우에 대한 예외처리
            try {
                numOfCard = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner = new Scanner(System.in);
                numOfCard = 1001;
            }

            if(numOfCard >= 1 && numOfCard <= 1000) break;
            else System.out.print(Constants.NUM_ERROR_MSG);
        }

        System.out.print("\n");

        return numOfCard;
    }


}


