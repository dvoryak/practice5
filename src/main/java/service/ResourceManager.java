package service;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;

    private ResourceBundle resourceBundle;
    private final String resourceName = "message";

    ResourceManager() {
        this.resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    public void changeResources(Locale locale) {
        this.resourceBundle = ResourceBundle.getBundle(resourceName,locale);
    }

    public String getValue(String key) {
        try {
            return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Enumeration getKeySet() {
        return resourceBundle.getKeys();
    }

    public Locale getLocale() {
        return resourceBundle.getLocale();
    }
}
