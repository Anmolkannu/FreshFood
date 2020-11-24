package com.example.freshfood.Database;

public class Accounts {
        String Username, Password, Email, Phone;
        public Accounts( String username, String password, String email, String phone)
        {

            Username = username;
            Password = password;
            Email = email;
            Phone = phone;
        }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
