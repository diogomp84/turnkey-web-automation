package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {

    private static final String PREFIX_EMAIL = "cloudapp_";
    private static final String SUFFIX_EMAIL = "@automation.com";

    private static final String DEFAULT_PASSWORD = "CloudApp123";
    public static UserCredential generateRandomUserCredential() {
        String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(6);
        String email = PREFIX_EMAIL + randomAlphanumeric + SUFFIX_EMAIL;
        return new UserCredential(email,DEFAULT_PASSWORD);
    }
}
