package person;

public class Person {
    private String firstName;
    private String lastName;
    private String emailID;
    private StringBuffer phoneNumber;

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

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public StringBuffer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(StringBuffer phoneNumber) {
        if (phoneNumber == null)
            this.phoneNumber = phoneNumber;
        else
            this.phoneNumber.append(", " + phoneNumber);
    }

    @Override
    public String toString() {
        if (this.getEmailID() != "")
            return "-------- * -------- * -------- * --------\n" +
                    "First Name: " + this.getFirstName() + '\n' +
                    "Last Name: " + this.getLastName() + '\n' +
                    "Contact Number(s): " + this.getPhoneNumber() + '\n' +
                    "Email Address: " + this.getEmailID() + '\n' +
                    "-------- * -------- * -------- * --------";
        else
            return "-------- * -------- * -------- * --------\n" +
                    "First Name: " + this.getFirstName() + '\n' +
                    "Last Name: " + this.getLastName() + '\n' +
                    "Contact Number(s): " + this.getPhoneNumber() + '\n' +
                    "-------- * -------- * -------- * --------";
    }
}
