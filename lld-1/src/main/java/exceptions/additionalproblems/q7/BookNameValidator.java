package exceptions.additionalproblems.q7;

public class BookNameValidator {

    public static void validate(String bookName) throws InvalidBookNameException {
        if (!bookName.startsWith("Scaler Java")) {
            throw new InvalidBookNameException("Book name doesn't start with Scaler Java");
        } else {
            System.out.println("Book created!: " + bookName);
        }
    }

    public static void main(String[] args) {


        try {
            validate("Scaler Java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java Programming");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate("Scaler Java Learn Here");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java is amazing");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java Scaler Java::::");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("ScalerJava");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Java Programming by Scaler");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate(" ");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate("");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("scaler java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

    }
}