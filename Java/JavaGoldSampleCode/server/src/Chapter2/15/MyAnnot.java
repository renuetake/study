// 複数回利用される@MyAnnotアノテーション
import java.lang.annotation.*;

@Repeatable(MyAnnotContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnot{
    public String value();
}