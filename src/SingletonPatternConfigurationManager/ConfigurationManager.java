package SingletonPatternConfigurationManager;

import java.io.IOException;
import java.io.InputStream;
import java.lang.*;
import java.util.Properties;

public class ConfigurationManager {

    //private static instance of the class
    private static ConfigurationManager instance;  //This line declares a static variable to hold the single instance of the class.

    private Properties properties;

    private ConfigurationManager() { //Ensures that no other class can instantiate the ConfigurationManager() directly. this restricts the creation of object.
        properties = new Properties();
        loadConfiguration();
    }

    //This method is responsible for creating the instance if it doesn't already exist and returning the existing instance.
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;

    }

    private void loadConfiguration() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            // Load the properties file
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {

        return properties.getProperty(key);
    }
}
