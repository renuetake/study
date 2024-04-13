//@Targetの利用
import java.lang.annotation.*;
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MyAnnot{
}