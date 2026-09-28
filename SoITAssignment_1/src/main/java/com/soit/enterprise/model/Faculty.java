package com.soit.enterprise.model;

public class Faculty {

    public int id;

    public String firstname;

    public String lastname;

    public String title;

    public String email;

    public Faculty(){
    }

    public Faculty(int id, String firstname, String lastname, String title, String email){
        this.id = id;
        this.email = email;
        this.title = title;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
            this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
                this.email = email;
    }

    public String getFirstName(){
            return firstname;
        }

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public String getLastName(){
            return lastname;
    }

    public void setLastName(String lastname){
            this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void getTitle(String title){
        this.title = title;
    }

    public String toString() {
        return "Faculty( ID: " + this.id + ", firstname: " + firstname + ", lastname: " + lastname + ", title: " + title + ", email: " + email;
    }
}