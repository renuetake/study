// Propertiesクラスの利用

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources", Locale.US);
        Properties props = new Properties();
        bundle.keySet().stream().forEach(k -> props.put(k, bundle.getString(k)));
        method(props);
    }

    static void method(Properties props){
        System.out.println(props.get("send"));
        System.out.println(props.getProperty("send"));
        System.out.println(props.get("xxx"));
        System.out.println(props.getProperty("xxx"));
        System.out.println(props.getProperty("xxx", "default"));
    }
}