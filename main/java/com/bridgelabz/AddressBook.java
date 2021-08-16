package com.bridgelabz;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/* @Description - To create a contacts in address book with first name, last name, address, city, state,
 * zip,mobile number.*/

public class AddressBook {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Gagan SR\\Desktop\\Csv Reader\\AddressBookIO";
        System.out.println("Starting File writing :" + filePath);
        writeCsv(filePath);
        System.out.println("starting read file");
        readCsv(filePath);
    }

    private static void readCsv(String filePath) {
    }

    public static void writeCsv(String filePath) {
        List<Contacts> contacts = new ArrayList<Contacts>();
        Contacts contacts1 = new Contacts(filePath, filePath, filePath, filePath, filePath, filePath, filePath,
                filePath, filePath);
        contacts1.setFirstName("Gagan");
        contacts1.setLastName("Reddy");
        contacts1.setAddress("Heelalige");
        contacts1.setCity("Bangalore");
        contacts1.setState("KA");
        contacts1.setZip("223223");
        contacts1.setMobileNumber("8052636931");
        contacts1.setEmailId("gagan99@gmail.com");
        contacts1.add(contacts1);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append("firstName,lastName,address,city,state,zip,mobileNumber,EmailId");
            for (Contacts ad : contacts) {
                fileWriter.append(String.valueOf(ad.getFirstName()));
                fileWriter.append(String.valueOf(ad.getLastName()));
                fileWriter.append(String.valueOf(ad.getAddress()));
                fileWriter.append(String.valueOf(ad.getCity()));
                fileWriter.append(String.valueOf(ad.getState()));
                fileWriter.append(String.valueOf(ad.getZip()));
                fileWriter.append(String.valueOf(ad.getMobileNumber()));
                fileWriter.append(String.valueOf(ad.getEmailId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
