public final class CipherUtils {

    private static final int ALPHABET_SIZE = 26;
    private CipherUtils() { }


    public static char shift(char c, int k) {
        // 1.ensures that only letters are used in cipher
        if (!Character.isLetter(c) || c > 'z') {
            return c;
        }

        char base = Character.isUpperCase(c) ? 'A' : 'a';
        // 2.preserves case so letters are accepted regardless of case.

        int position = c - base;
        //3. convert the letter to a position of 0-25

        int shifted = ((position + k) % ALPHABET_SIZE + ALPHABET_SIZE) % ALPHABET_SIZE;
        // 4. Add the shift and wrap it into 0-25

        return (char) (shifted + base);
    }

    public static
}
