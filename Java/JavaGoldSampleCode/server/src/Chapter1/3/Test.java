// staticメンバのクラス内でのアクセス
public class Test {
    int instanceVal;                                // インスタンス変数
    static int staticVal;                           // static変数
    int methodA(){ return instanceVal; }            // OK
    int methodB(){ return staticVal; }              // OK
    //static int methodC(){ return instanceVal; }   // NG staticメンバ→インスタンスメンバのため
    static int methodD() { return staticVal; }      // OK
    static int methodE() {
        Test obj = new Test();
        return obj.instanceVal;
    }
}
