package oop_3.additionalproblems.q5;

public class User {
    private final String username;
    private final String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        User user = new User("john_doe", "john.doe@example.com");
        user.displayInfo();
    }
}