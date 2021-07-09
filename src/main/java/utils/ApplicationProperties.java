package utils;

import java.io.IOException;
import java.util.Properties;

public enum ApplicationProperties {

    INSTANCE;

    private final Properties properties;

    ApplicationProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return properties.getProperty("userName");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public String getFirstName() {
        return properties.getProperty("firstName");
    }

    public String getLastName() {
        return properties.getProperty("lastName");
    }

    public String getPostalCode() {
        return properties.getProperty("postalCode");
    }

    public String getUserName5() {
        return properties.getProperty("userName5");
    }

    public String getPassword5() {
        return properties.getProperty("password5");
    }

    public String getBaseUrl5() {
        return properties.getProperty("baseUrl5");
    }
}
