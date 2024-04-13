// カスタムアノテーションの実装3
public @interface MyAnnot {
    public enum RANK {A, B, C, D};
    RANK rank();
    //RANK rank() default RANK.B;
    String item();
    int num();
}