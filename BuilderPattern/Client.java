/**
 * @author 2016112148 최서정
 */

package com.chloe.BuilderPattern;

public class Client {

    public static void main(String[] args) {
        String input = "FirstName:Seojeong Age:24";

        Builder builder = new Builder();
        new Parser(builder).parse(input);

        try{
            User user = builder.build();
            System.out.println("성공적으로 사용자가 생성되었습니다");
        }catch (BuilderException e) {
            System.out.println(e.getMessage());
        }
    }
}
