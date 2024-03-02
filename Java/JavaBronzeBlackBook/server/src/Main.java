public class Main {
    private static int a;
    private int b;

    public static int countUpA(){
        return ++a;
    }

    public int doMethod() {
        return countUpA();
    }

    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.doMethod());
        System.out.println(" " + main.countUpA());
    }
}