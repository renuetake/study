// カスタムアノテーションの利用3
public class Foo {

    @MyAnnot(
        rank=MyAnnot.RANK.C,
        item="itemX",
        num=100)
    public void method(int a){
        
    }
}