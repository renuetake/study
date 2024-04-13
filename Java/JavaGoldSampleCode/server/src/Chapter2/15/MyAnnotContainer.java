//@MyAnnotアノテーションのデータを保持するMyAnnotContainerアノテーション
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotContainer {
    public MyAnnot[] value();
}