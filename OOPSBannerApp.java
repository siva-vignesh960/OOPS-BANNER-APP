import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Uses HashMap to store character patterns
 */
public class OOPSBannerApp {

    /**
     * Utility method to create and return character pattern map
     */
    public static Map<Character, String[]> createCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        // Pattern for P
        map.put('P', new String[]{
                "******* ",
                "*      *",
                "*      *",
                "******* ",
                "*       ",
                "*       ",
                "*       "
        });

        // Pattern for S
        map.put('S', new String[]{
                " *****  ",
                "*     * ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        });

        return map;
    }

    /**
     * Method to render banner message
     */
    public static void renderBanner(String message, Map<Character, String[]> map) {

        // Loop for 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each character
            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = createCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}