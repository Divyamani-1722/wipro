public class NullPointerExceptionDemo {
	public static void main(String[] args) {
        try {
            String str = null; 
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block after NullPointerException");
        }
    }
}
