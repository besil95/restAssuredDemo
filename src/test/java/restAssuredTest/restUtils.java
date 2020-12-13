package restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class restUtils {

    public static String getTitle() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Harry Potter" + generatedString);
    }

    public static String getYear() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("2001" + generatedString);
    }

}
