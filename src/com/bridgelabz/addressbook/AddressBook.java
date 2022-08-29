package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
    static Scanner sc = new Scanner(System.in);

    public class Contacts {
        String fname;
        String lname;
        String address;
        String city;
        String State;
        int zip;
        String email;
        long phonenumber;
    }
}