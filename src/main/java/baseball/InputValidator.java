package baseball;

public class InputValidator {

    public static final int NUMBER_LENGTH = 3;

    public static void validateLength(String input) {
        if (input.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateNumbers(String input) {
        for (int i = 0 ; i < NUMBER_LENGTH ; i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException();
            } else if (Character.getNumericValue(input.charAt(i)) == 0) {
                throw new IllegalArgumentException();
            }
        }
    }


}