package Chapter3;

public class Sample3_13 {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
            case 1:
            case 2:
                System.out.println("1 または 2");   // numの値が1または2の場合の処理                
                break;
            case 3:
            case 4:
                System.out.println("3 または 4");   // numの値が3または4の場合の処理
                break;
        
            default:
                System.out.println("default");      // numの値が1から4以外の処理
        }
    }
}
