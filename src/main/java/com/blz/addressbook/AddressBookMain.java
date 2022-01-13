package com.blz.addressbook;

public class AddressBookMain {
    //Manin Methode
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
    }
    // Declaring Variable
    public static String firstName;
    public static String lastName;
    public static String city;
    public static String state;
    public static String address;
    public static String emailId;
    public static long phoneNo;
    public static int zipCode;

    //Function to collect person Data
    public String getFirstName(String fName){
        if(fName!="" && fName!=null){
            firstName=fName;
            return firstName;
        }
        else {
            return "Invalid firstname";
        }

    }
    public String getLastName(String lName){
        if(lName!="" && lName!=null) {
            lastName = lName;
            return lastName;
        }else {

            return "Invalid lastName";
        }
    }
    public String getCity(String cityName){
        city=cityName;
        return city;
    }
    public String getState(String stateName){
        state=stateName;
        return state;
    }
    public String getAddress(String addressInput){
        address=addressInput;
        return address;
    }
    public String getEmailId(String emailIdInput){
        emailId=emailIdInput;
        return emailId;
    }

    public  long getPhoneNo(long phoneNumber) {
        phoneNo=phoneNumber;
        return phoneNo;
    }

    public  int getZipCode(int zipCodeNUmber) {
        zipCode=zipCodeNUmber;
        return zipCode;
    }
}

