package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
    static Scanner sc = new Scanner(System.in);


    public static ArrayList<Contacts> getArrayDetails() {
        return arrayDetails;
    }

    public static class Contacts {
        String fname;
        String lname;
        String address;
        String city;
        String State;
        int zip;
        long phonenumber;
        String Email;

        public Contacts(String fname, String lname, String address, String city, String state, int zip, long phonenumber, String email) {
            this.fname = fname;
            this.lname = lname;
            this.address = address;
            this.city = city;
            State = state;
            this.zip = zip;
            this.phonenumber = phonenumber;
            Email = email;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public long getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(long phonenumber) {
            this.phonenumber = phonenumber;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

            static void welcome() {
                System.out.println("Welcome to Address Book System Program ");
            }

            public static void main(String[] args) {
                welcome();

                //We are just calling an object using class name.
                //Simply passing the argument value according to the parameter defined in the constructor.

                Contacts details = new Contacts("Mukesh", "kapse", "Temni", "betul", "M.P", 460110, 706732384, "mukesh1832@gmail.com");
                System.out.println("The following contact details is mentioned below :");
                System.out.println("First Name : " + details.getFname());
                System.out.println("Last Name  : " + details.getLname());
                System.out.println("Address    : " + details.getAddress());
                System.out.println("City       : " + details.getCity());
                System.out.println("State      : " + details.getState());
                System.out.println("E-mail     : " + details.getEmail());
                System.out.println("Zip Code   : " + details.getZip());
                System.out.println("Phone No   : " + details.getPhonenumber());
            }
        }

    }

