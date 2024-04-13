//@MyAnnotアノテーションを利用しているクラス
@MyAnnot("test1")
public class Foo{
    @MyAnnot("test2")
    @MyAnnot("test3")
    public void method(int a){}
}