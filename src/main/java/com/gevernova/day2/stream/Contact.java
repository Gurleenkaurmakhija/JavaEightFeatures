package com.gevernova.day2.stream;

public class Contact {

    // contact details
    private String firstName, lastName, address, city, state, email;
    private int zip;
    private long phoneNumber;

    // constructor to initialize contact
    public Contact(String firstName, String lastName, String address,
                   String city, String state, String email,
                   int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getEmail() { return email; }
    public int getZip() { return zip; }
    public long getPhoneNumber() { return phoneNumber; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setEmail(String email) { this.email = email; }
    public void setZip(int zip) { this.zip = zip; }
    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

//     contact information
    @Override
    public String toString() {
        return firstName + " " + lastName +
                ", City=" + city +
                ", State=" + state +
                ", Zip=" + zip +
                ", Phone=" + phoneNumber;
    }
}
