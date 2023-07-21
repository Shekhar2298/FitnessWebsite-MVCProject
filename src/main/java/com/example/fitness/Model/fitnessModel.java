package com.example.fitness.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fitdata")
public class fitnessModel {

    @Id
    private String Emailid;

    @Column(nullable = false)
    private String Name;

    @Column(name = "Mobile", nullable = false, unique = true)
    private String contactmobi;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String zipy;

    @Column(nullable = false)
    private String psw;

    @Column(nullable = false)
    private String cfpsw;

    public fitnessModel() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public String getContactmobi() {
        return contactmobi;
    }

    public void setContactmobi(String contactmobi) {
        this.contactmobi = contactmobi;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipy() {
        return zipy;
    }

    public void setZipy(String zipy) {
        this.zipy = zipy;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getCfpsw() {
        return cfpsw;
    }

    public void setCfpsw(String cfpsw) {
        this.cfpsw = cfpsw;
    }

    // public enum LoginResult {
    // SUCCESS,
    // USER_NOT_FOUND,
    // INVALID_PASSWORD
    // }

    @Override
    public String toString() {
        return "fitnessModel [Emailid=" + Emailid + ", Name=" + Name + ", contactmobi=" + contactmobi + ", country="
                + country + ", state=" + state + ", city=" + city + ", address=" + address + ", zipy=" + zipy + ", psw="
                + psw + "]";
    }

}