package com.hillel.lecture_14;

import java.util.List;

/**
 * Created by alpa on 12/8/19
 */
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String company;
    private String email;
    private List<String> phone = null;
    private Address address;
    private List<Friend> friends = null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"firstName\":\"" + firstName + "\"," +
                "\"lastName\":\"" + lastName + "\"," +
                "\"age\":" + age + "," +
                "\"gender\":\"" + gender + "\"," +
                "\"company\":\"" + company + "\"," +
                "\"email\":\"" + email + "\"," +
                "\"phone\":" + phone.toString().replaceAll("\\+", "\"+").replaceAll("]", "\"]").replaceAll(",", "\",").replaceAll(", ", ",") + "," +
                "\"address\":" + address + "," +
                "\"friends\":" + friends.toString().replaceAll(", ", ",") +
                "}";
    }
}
