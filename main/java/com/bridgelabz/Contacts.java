package com.bridgelabz;

/* @Description - To create a contacts in address book with first name, last name, address, city, state,
 * zip,mobile number. */
public class Contacts {
    public String firstName;
    private String lastName;
    private String address;
    public String city;
    public String state;
    private int zip;
    private long mobileNumber;
    private String emailId;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zip, long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public Contacts(String filePath, String filePath1, String filePath2, String filePath3, String filePath4, String filePath5, String filePath6, String filePath7, String filePath8) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(String s) {
        this.zip = zip;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String s) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", mobileNumber=" + mobileNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public void add(Contacts contacts1) {
    }
}