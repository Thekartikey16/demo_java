public class CombineExample {

    // throw an exception
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // throw the exception
            throw new IllegalArgumentException("Age must be 18 or above");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);  //throw
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}