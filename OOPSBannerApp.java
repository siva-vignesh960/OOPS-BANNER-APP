/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns using a Static Inner Class
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to encapsulate character and its pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character Character to store
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7-line string pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get O pattern
     */
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });
    }

    /**
     * Utility method to get P pattern
     */
    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
                "******* ",
                "*      *",
                "*      *",
                "******* ",
                "*       ",
                "*       ",
                "*       "
        });
    }

    /**
     * Utility method to get S pattern
     */
    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
                " *****  ",
                "*     * ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        });
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Create array of CharacterPattern objects
        CharacterPattern[] letters = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        // Print banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPattern letter : letters) {
                lineBuilder.append(letter.getPattern()[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}