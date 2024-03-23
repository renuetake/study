package Chapter3;
public class Sample_7 {
    public static void main(String[] args){
        // StringBuilderで文字列を直接操作する
        
        StringBuilder sb1 = new StringBuilder("Ab Cdefge");
        System.out.println("append(\"XYZ\")     : " + sb1.append("XYZ"));

        StringBuilder sb2 = new StringBuilder("Ab Cdefge");
        System.out.println("insert(2, \"ZZ\")   : " + sb2.insert(2, "ZZ"));

        StringBuilder sb3 = new StringBuilder("Ab Cdefge");
        System.out.println("delete(0,5)         : " + sb3.delete(0, 5));

        StringBuilder sb4 = new StringBuilder("Ab Cdefge");
        System.out.println("replace(3, sb4.length(), \"YYY\")     : " + sb4.replace(3, sb4.length(), "YYY"));

        StringBuilder sb5 = new StringBuilder("Ab Cdefge");
        System.out.println("substring(5)        : " + sb5.substring(5));
        
    }
}