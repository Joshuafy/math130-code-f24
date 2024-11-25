public class Person {
    // Now, every Person object has a field
    // called firstName
    public String firstName;
    private String lastName;

      // usually, there's one param for each field
    public Person(String firstName, String lastName) {
        // field          // param
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter methods change field values:
    public void setFirstName(String newFirstName) {
        if (newFirstName.equals("bad word")) {
            return;
        } else {
            firstName = newFirstName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // make a method firstHalf in Person the checks the first letter of the
    // person's first name and returns true if the letter is in
    // the first of the alphabet and false otherwise
    public boolean firstHalf() {
        if (firstName.charAt(0) <= 'M') {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(Person other) {
        // this.getFirstName() is the first name of the current Person
        if (this.getFirstName() == other.getFirstName() && this.getLastName() == other.getLastName()) {
            return true;
        } else {
            return false;
        }
    }
}
