public class GettingGreater {
    public static void main(String[] args) {
        java.io.Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        String input1 = console.readLine("Enter the first character: ");
        String input2 = console.readLine("Enter the second character: ");

        if (input1.length() != 1 || input2.length() != 1) {
            System.out.println("Please enter exactly one character for each input.");
            return;
        }

        char char1 = input1.charAt(0);
        char char2 = input2.charAt(0);

        char maxChar = (char) Math.max(char1, char2);

        System.out.println("The character with the greater value is: " + maxChar);
        System.out.println("ASCII code of '" + char1 + "' is: " + (int) char1);
        System.out.println("ASCII code of '" + char2 + "' is: " + (int) char2);
    }
}
