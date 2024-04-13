//@Inheritedを確認するクラス
public class Main {

    static String getVal(MyAnnot an){
        if (an == null) return "null";
        return an.value();
    }
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException{
        Class[] ary = {ChildA.class, ChildB.class, ChildC.class};
        for (Class<?> cls : ary){
            System.out.println("【"  + cls.getSimpleName() + "】");
            System.out.println(getVal(cls.getAnnotation(MyAnnot.class)));
            System.out.println(getVal(cls.getDeclaredField("field").getAnnotation(MyAnnot.class)));
            System.out.println(getVal(cls.getDeclaredMethod("method").getAnnotation(MyAnnot.class)));
            System.out.println();

        }
    }
}
