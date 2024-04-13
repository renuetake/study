//@Targetの利用
//@MyAnnot // 使用できない
public class Foo {

    @MyAnnot // 使用可能
    int num;

    //@MyAnnot // 使用可能
    public void method(int a){}
}