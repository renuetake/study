public class Sample_2{
    public static void main(String[] args){
        float   x1  = 3_.1415F;        // NG (コンパイルエラー)
        float   x2  = 3._1415F;        // NG (コンパイルエラー)
        long    x3  = 999_999_9999_L;  // NG (コンパイルエラー)
        int     x4  = _52;             // NG (コンパイルエラー)
        int     x5  = 5_2;             // OK
        int     x6  = 52_;             // NG (コンパイルエラー)
        int     x7  = 5_______2;       // OK
        int     x8  = 0_x52;           // NG (コンパイルエラー)
        int     x9  = 0x_52;           // NG (コンパイルエラー)
        int     x10 = 0x5_2;           // OK
        int     x11 = 0_52;            // OK
    }
}