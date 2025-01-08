import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // カードを１組（52枚）作成
        Card[] cards = new Card[52];
        String[] marks = {"♠︎", "❤️", "♦️", "♣︎"};
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<13 ; j++) {
                Card card = new Card(marks[i], j+1);
                cards[i*13+j] = card;
            }
        }

        // カードをシャッフルする
        Main.shuffle(cards);

        // カードを表示する
        for (int i=0; i<cards.length;i++) {
            System.out.println(cards[i].mark + cards[i].number);
        }
    }

    static void shuffle(Card[] cards) {
        for(int i=0 ; i<1000 ; i++) {
            Random rnd = new Random();
            int r1 = rnd.nextInt(cards.length);
            int r2 = rnd.nextInt(cards.length);
            Card tmp = cards[r1];
            cards[r1] = cards[r2];
            cards[r2] = tmp;
        }
    }
}
