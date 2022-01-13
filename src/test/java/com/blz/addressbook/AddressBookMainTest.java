package com.blz.addressbook;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookMainTest {
    AddressBookMain addressBookMain = new AddressBookMain();
//Checked first name is valid
    @Test
    public void givenFirstNamecheckIsValid() {
        String expected="Manisha";
        String actual=addressBookMain.getFirstName("Manisha");
        Assert.assertEquals(expected,actual);
    }
//checked first name is Invalid
    @Test
    public void givenFirstNamecheckIsInValid() {
        String expected="Invalid firstname";
        String actual=addressBookMain.getFirstName("");
        Assert.assertEquals(expected,actual);
    }
    //Checked last name is valid
    @Test
    public void givenLastNamecheckIsValid() {
        String expected="Kahar";
        String actual=addressBookMain.getLastName("Kahar");
        Assert.assertEquals(expected,actual);
    }
    //checked last name is Invalid
    @Test
    public void givenLastNameCheckIsInValid() {
        String expected="Invalid lastName";
        String actual=addressBookMain.getLastName("");
        Assert.assertEquals(expected,actual);
    }
    //Checked city name is valid
    @Test
    public void givenCityNamecheckWhenIsValidShouldReturn() {
        String expected="Mumbai";
        String actual=addressBookMain.getCity("Mumbai");
        Assert.assertEquals(expected,actual);
    }

    //Checked state name is valid
    @Test
    public void givenstateNamecheckIsValid() {
        String expected="Up";
        String actual=addressBookMain.getState("Up");
        Assert.assertEquals(expected,actual);
    }

    //Checked address  is valid
    @Test
    public void givenAddressCheckIsValid() {
        String expected="Nerul";
        String actual=addressBookMain.getAddress("Nerul");
        Assert.assertEquals(expected,actual);
    }

    //Checked EmailNO name is valid
    @Test
    public void givenEmailIdCheckIsValid() {
        String expected="Abc@gamil.com";
        String actual=addressBookMain.getEmailId("Abc@gamil.com");
        Assert.assertEquals(expected,actual);
    }

    //Checked Phone Number is valid
    @Test
    public void givenPhoneNoCheckIsValid() {
        long expected=98767463;
        long actual=addressBookMain.getPhoneNo(98767463);
        Assert.assertEquals(expected,actual);
    }

    //Checked ZipCode is valid
    @Test
    public void givenZipCodeCheckIsValid() {
        int expected=9876;
        int actual=addressBookMain.getZipCode(9876);
        Assert.assertEquals(expected,actual);
    }
}
