// 米国用のリソースバンドル

import java.util.ListResourceBundle;

public class MyResources_en_US extends ListResourceBundle{
    protected Object[][] getContents(){
        Object[][] contents = {{"send", "send"}, {"cancel", "cancel"}};
        return contents;
    }    
}