//@MyAnnotアノテーションを利用しているクラス
@MyAnnot("MyInter#Type")
interface MyInter {
    @MyAnnot("MyInter#method")
    public void method();
}

@MyAnnot("Parent#Type")
class Parent {
    @MyAnnot("Parent#field")
    protected String field;

    @MyAnnot("Parent#method")
    public void method() { }
}

class ChildA extends Parent{
    protected String field;
    public void method(){ }
}

class ChildB implements MyInter {
    protected String field;
    public void method() { }
}

@MyAnnot("ChildC#Type")
class ChildC extends Parent {
    @MyAnnot("ChildC#field")
    protected String field;

    @MyAnnot("ChildC#method")
    public void method() { }
}