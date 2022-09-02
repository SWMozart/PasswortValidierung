import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortValiedierungTest{

        @Test
        void getLengthTest() {
            // GIVEN
            String password = "password";
            // WHEN
            int actual = PasswortValidierung.getLength(password);

            // THEN
            assertEquals(8, actual);
        }

        @Test
        void checkLengthTestForLonger8() {
            // GIVEN
            String password = "password1";
            // WHEN
            String actual = PasswortValidierung.checkLength(password);

            // THEN
            assertEquals("Passwort akzeptiert", actual);
        }

        @Test
        void checkLengthTestForShorter8() {
            // GIVEN
            String password = "pass";
            // WHEN
            String actual = PasswortValidierung.checkLength(password);

            // THEN
            assertEquals("Passwort zu kurz!", actual);
        }

        @Test
        void checkNumberTestforNoNumber() {
            // GIVEN
            String password = "passwort";

            // WHEN
            boolean actual = PasswortValidierung.checkNumber(password);

            // THEN
            assertEquals(false, actual);
        }
    }
