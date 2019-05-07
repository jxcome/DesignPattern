/**
 * @author 2016112148 최서정
 */

package com.chloe.BuilderPattern;

public class Parser {
    Builder builder;
    String[] pres = {"FirstName", "LastName", "Age", "Phone", "Address"};

    public Parser(Builder builder) {
        this.builder = builder;
    }

    public void parse(String input) {
        String[] datas = input.split(" ");

        for (int i = 0; i < 5; i++) {
            String data = findData(datas, pres[i]);

            if (data != null) {
                switch (i) {
                    case 0:
                        builder.setFirstName(data);
                        break;
                    case 1:
                        builder.setLastName(data);
                        break;
                    case 2:
                        builder.setAge(Integer.parseInt(data));
                        break;
                    case 3:
                        builder.setPhone(data);
                        break;
                    case 4:
                        builder.setAddress(data);
                        break;
                }
            }
        }
    }

    private String findData(String[] datas, String pre) {
        for(String str : datas) {
            if (str.contains(pre)) {
                String[] temp = str.split(":");
                return temp[1];
            }
        }
        return null;
    }
}
