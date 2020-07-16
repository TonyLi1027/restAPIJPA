package com.flexon.restAPIJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JAVAStudent {
    //@JsonIgnore //filter this in response
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;


    private String name;


    private String lastname;


    private int phoneNume;

    public JAVAStudent(){

    }

    public JAVAStudent(String name, String lastname, int phoneNume){
        super();
        this.name = name;
        this.lastname = lastname;
        this.phoneNume = phoneNume;
    }

    public int getStudentID() {
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getPhoneNume(){
        return phoneNume;
    }

    public void setPhoneNume(int phoneNume){
        this.phoneNume = phoneNume;
    }

    @Override
    public String toString() {
        return "JAVAStudent [studentID=" + ID + ", name=" + name + ", lastname=" + lastname + ", phoneNumber="
                + phoneNume + "]";
    }




}
