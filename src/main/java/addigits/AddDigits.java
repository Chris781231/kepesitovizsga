package addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (isEmpty(input)) {
            return -1;
        }

        int sum = 0;
        for (char temp : input.toCharArray()) {
            if (Character.isDigit(temp)) {
                sum += Integer.parseInt(String.valueOf(temp));
            }
        }
        return sum;
    }

    private boolean isEmpty(String input) {
        return input == null || input.isBlank();
    }
}
