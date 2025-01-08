public class Poker {
    void start() {
        // カードを１組（52枚）作成
        Card[] cards = new Card[52];
        String[] marks = {"♠︎", "♥️", "♦️", "♣︎"};
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<13 ; j++) {
                Card card = new Card(marks[i], j+1);
                cards[i*13+j] = card;
            }
        }

        // カードをシャッフルする
        shuffle(cards);

        // カードを表示する
        for (int i=0; i<5;i++) {
            System.out.print(cards[i].mark + cards[i].number + " ");
        }
        System.out.println();
    }

    void shuffle(Card[] cards) {
        for(int i=0 ; i<1000 ; i++) {
            int r1 = (int)(Math.random() * cards.length);
            int r2 = (int)(Math.random() * cards.length);
            Card tmp = cards[r1];
            cards[r1] = cards[r2];
            cards[r2] = tmp;
        }
    } 
}
