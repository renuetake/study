// 列挙型の使用
public class Main {
    public static void main(String[] args) {
        Card card = Card.SPADES;
        switch(card){
            case SPADES:
            case CLUBS:
            System.out.println("black"); break;
            case DIAMONDS:
            case HEARTS:
            System.out.println("red"); break;
        }
    }    
}
