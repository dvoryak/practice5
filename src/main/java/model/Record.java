package model;

public class Record {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;

    public Record() {
    }

    public Record(String lastName, String firstName, String dateOfBirth, String phoneNumber, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public Record buildLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Record buildFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Record buildDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Record buildPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Record buildAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(5);
        return sb.append(firstName).append(" ").append(lastName).
                append(" ").append(dateOfBirth).append(" ").append(phoneNumber).
                append(" ").append(address).toString();
    }
}
