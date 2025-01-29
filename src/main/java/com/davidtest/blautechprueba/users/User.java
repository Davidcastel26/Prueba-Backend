package com.davidtest.blautechprueba.users;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private String mailingAddress;
    private String email;
    private String dob;
    private String password;


    public User (Long id, String name, String lastName, String mailingAddress, String email, String dob, String password){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.mailingAddress = mailingAddress;
        this.email = email;
        this.dob = dob;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName) {
        this.lastName = lastName;
    }
    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress( String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }
    public String getDob() {
        return dob;
    }

    public void setDob( String dob) {
        this.dob = dob;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword( String password) {
        this.password = password;
    }

}
