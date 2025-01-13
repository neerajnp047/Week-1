public class NullPointerExceptionDemo {

    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        System.out.println("String length: " + text.length());
    }

    public static void handleException(String text) {
        System.out.println("Handling Exception...");
        try {
            System.out.println("String length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to call a method on a null reference.");
        }
    }

    public static void main(String[] args) {
        String text = null;

        System.out.println("Calling generateException()...");
        try {
            generateException(text);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in generateException.");
        }

        System.out.println("Calling handleException()...");
        handleException(text);
    }
}
