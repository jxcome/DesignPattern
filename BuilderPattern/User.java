/**
 * @author 2016112148 최서정
 */

package com.chloe.BuilderPattern;

public class User extends Exception{
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        
        if (lastName == null) throw new BuilderException("lastName을 설정해 주세요");
        else this.lastName = lastName;
    }

    public void setAge(int age) {this.age = age;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setAddress(String address) {this.address = address;}
}
