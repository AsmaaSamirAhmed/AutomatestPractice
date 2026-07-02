package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UrlReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = UrlReader.class.getClassLoader()
                .getResourceAsStream("urls.properties")) {

            if (input == null) {
                throw new RuntimeException("urls.properties not found in resources folder");
            }
            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load urls.properties", e);
        }
    }

    public static String getUrl(String key) {
        String url = properties.getProperty(key);
        if (url == null) {
            throw new IllegalArgumentException("No URL found for key: " + key);
        }
        return url;
    }
}
