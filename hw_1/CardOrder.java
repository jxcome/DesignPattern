package com.chloe;

/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card
 * and determine the price
 *
 */
public class CardOrder {
    private Name name;
    private char border;
    private int numCards;

    private static final int CARD_LEN = 32;  //the length of the card in characters

    public CardOrder(String fullName) {
        String[] names = fullName.split(" ");

        if(names.length == 3) name = new Name(names[0], names[1], names[2]);
        else name = new Name(names[0], names[1]);

        border = '*';
        numCards = 0;
    }

    public char getBorder() {
        return border;
    }

    public void setBorder(char ch) {
        border = ch;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int n) {
        numCards = n;
    }

    public String getSampleCard() {
        return getTopLine() + getBlankLine() + this.getLineWithName()
                + getBlankLine() + getTopLine();
    }

    private String getTopLine() {
        String borderLine = "";
        String inits = "";

        if (name.getMiddleName() == null) {
            inits += name.getFirstName().charAt(0);
            inits += name.getLastName().charAt(0);

            for(int i = 0; i < 28; i++) borderLine +=getBorder();
        }
        else {
            inits += name.getFirstName().charAt(0);
            inits += name.getMiddleName().charAt(0);
            inits += name.getLastName().charAt(0);

            for(int i = 0; i < 26; i++) borderLine +=getBorder();
        }

        return (inits + borderLine + inits + "\n");
    }

    private String getBlankLine() {
        String blank = "";

        for(int i = 0; i < 30; i++) blank += " ";

        return (getBorder() + blank + getBorder() + "\n");
    }

    /**
     * 명함의 세번째줄에 출력되는 line 구성
     *
     * @return 명함의 세번째줄
     */
    private String getLineWithName() {
        String fullName = "";
        String lineWithName = "";

        // 미드네임의 유무에 따라 다른 방법으로 fullName 처리
        if (this.name.getMiddleName() == null) {
            fullName += (this.name.getFirstName() + " " + this.name.getLastName());
        }
        else {
            fullName += (this.name.getFirstName() + " " + this.name.getMiddleName().charAt(0) + " " + this.name.getLastName());
        }

        // 총 너비가 32, 이름을 고려해 띄어쓰기의 수를 계산
        int numOfBlank = CARD_LEN - (2 + fullName.length());

        // border, blank, name으로 lineWithName을 구성
        lineWithName += getBorder();
        int limit;

        if ((numOfBlank % 2) == 0) limit = (numOfBlank / 2);
        else limit = (numOfBlank / 2 + 1);

        for (int i = 0; i < limit; i++) lineWithName += " ";

        lineWithName += fullName;

        for (int i = 0; i < (numOfBlank / 2); i++) lineWithName += " ";

        lineWithName += getBorder();


        return lineWithName + "\n";
    }

    public double getCardPrice() {
        int lengthOfName = 0;

        lengthOfName += this.name.getFirstName().length();
        if (this.name.getMiddleName() != null) lengthOfName += this.name.getMiddleName().length();
        lengthOfName += this.name.getLastName().length();

        // 고객 이름의 길이가 12자가 넘어가면 50원, 아니면 40원
        if(lengthOfName > 12) return 50;
        else return 40;
    }

    /**
     * 최종인쇄 내용
     */
    public void getFinalCost() {
        double totalPrice;
        int isDiscounted = 0;

        if (numCards >= 200) {

            // 대량주문이면 10% 할인
            isDiscounted = 1;
            totalPrice = (numCards * getCardPrice()) * 0.9;
        }
        else {
            totalPrice = numCards * getCardPrice();
        }

        // 주문 가격 인쇄
        System.out.print(Constants.TOTAL_PRICE_PRE + numCards +
                Constants.TOTAL_PRICE_POST + Integer.toString((int)totalPrice) + " " + Constants.WON + "\n");
        System.out.print(Constants.IS_DISCOUNTED[isDiscounted] + "\n");
    }
}
