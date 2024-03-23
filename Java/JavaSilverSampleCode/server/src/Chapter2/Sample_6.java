package Chapter2;

public class Sample_6 {
    //var a = 100;          // コンパイルエラー(メンバ変数にvarは使用できない)
    //static var b = 100;   // コンパイルエラー(メンバ変数にvarは使用できない)
    public static void main(String[] args){
        var c = "Hello";    // OK(String)
        var d = 100;        // OK(int)
        //var e;            // コンパイルエラー(初期値を指定せずにvarを使用できない)
        //var f = null;     // コンパイルエラー(nullだとf変数の型を推論できない)
        final var g = 100;  // OK(定数もOK)
        //var final h = 100;// コンパイルエラー(finalを使用するときはvarの左側に書く) 
    }
}