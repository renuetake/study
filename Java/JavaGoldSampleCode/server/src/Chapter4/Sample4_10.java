package Chapter4;

public class Sample4_10 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 5; i++){
            switch (i % 2) {
                case 0:
                    num++;
                    break;
                case 1:
                    break;
            }
        }
        System.out.println("num : " + num);
    }
}
