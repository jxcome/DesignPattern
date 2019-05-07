/**
 * @author 2016112148 최서정
 */

package com.chloe.BuilderPattern;

public class Builder {
    private String firstName;
    private String lastName;
    private int age = 0;
    private String phone = "";
    private String address = "";

    public User build() {
        User user = new User(firstName, lastName);

        user.setAge(age);
        user.setPhone(phone);
        user.setAddress(address);

        return user;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}

class BuilderException extends RuntimeException {
    BuilderException() {
        super();
    }

    BuilderException(String msg) {
        super(msg);
    }
}