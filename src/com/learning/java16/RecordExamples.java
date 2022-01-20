package com.learning.java16;

public class RecordExamples {
    public static void main(String[] args) {

        UserRecord user1 = new UserRecord("User1", 40);
        user1.printUserDetails();

        UserRecord user2 = new UserRecord("User2");
        user2.printUserDetails();
    }
}

// It defines the following
// Private Final fields name and age
// Constructor which takes name and age
// name() and age() methods to get name and age details.
record UserRecord(String name, Integer age) {
    //Canonical Constructor
    public UserRecord {
        if (age == null || age <= 0) {
            throw new RuntimeException("Cannot create user with invalid age");
        }

        // Providing Default name if null or empty
        if (name == null || name.isEmpty()) {
            name = "";
        }
    }

    // Constructor to provide default age
    UserRecord(String name) {
        this(name, 20);
    }

    //Method
    public void printUserDetails() {
        System.out.printf("User has name %s and age %d%n", name, age);
    }

}