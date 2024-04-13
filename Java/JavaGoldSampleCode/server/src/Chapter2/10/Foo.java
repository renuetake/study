// カスタムアノテーションの利用2
@MyAnnot(value="test1")
public class Foo {

    @MyAnnot("test2")
    public void method(int a){
        
    }
}