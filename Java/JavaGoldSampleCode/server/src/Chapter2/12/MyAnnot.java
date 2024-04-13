//@Documentedの利用
import java.lang.annotation.*;
@Documented
public @interface MyAnnot {
    public enum RANK {A, B, C, D};
    RANK rank();
    String item();
    int num();
}