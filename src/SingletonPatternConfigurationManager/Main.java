package SingletonPatternConfigurationManager;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Get the ConfigurationManager instance
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Access configuration properties
        String dbUrl = configManager.getProperty("db.url");
        String dbUser = configManager.getProperty("db.user");
        String dbPassword = configManager.getProperty("db.password");
        String apiKey = configManager.getProperty("api.key");

        // Print configuration properties
        System.out.println("Database URL: " + dbUrl);
        System.out.println("Database User: " + dbUser);
        System.out.println("Database Password: " + dbPassword);
        System.out.println("API Key: " + apiKey);
    }
}
