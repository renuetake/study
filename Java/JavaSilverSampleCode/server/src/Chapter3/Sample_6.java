package Chapter3;

public class Sample_6 {
    public static void main (String[] args){
        // Stringクラスのメソッドを使用した例
        String s = "abcdefa";
        System.out.println("s                   : " + s);
        System.out.println("charAt(2)           : " + s.charAt(2));
        System.out.println("indexOf('c')        : " + s.indexOf('c'));
        System.out.println("length()            : " + s.length());
        System.out.println("replace('a', 'z')   : " + s.replace('a', 'z'));
        System.out.println("substring(2)        : " + s.substring(2));
    }
}