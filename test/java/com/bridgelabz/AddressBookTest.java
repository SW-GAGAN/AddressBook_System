package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {


    @Test
    public void givenObject_WhenStoredInTheJson_ShouldReturn_TRUE() {
        Contacts contact = new Contacts("Gagan",
                "Reddy",
                "Heelalige",
                "Bangalore",
                "KA",
                223223,
                8052636931L,
                "gagan@gmail.com");

        AddressBook addressBook = new AddressBook();
        boolean isAdded = addressBook.jsonWrite(contact);
        Assert.assertTrue(isAdded);
    }

    @Test
    public void givenJsonFile_WhenRead_ShouldReturn_TRUE() {
        AddressBook addressBook = new AddressBook();
        boolean isRead = addressBook.jsonRead();
        Assert.assertTrue(isRead);
    }
}