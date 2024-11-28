public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        String[] marks = {"スペード", "ハート", "ダイヤ", "クラブ"};
        for (int i=0; i<4;i++) {
            for (int j=0;j<13;j++) {
                Card card = new Card(marks[i], j+1);
                cards[i*13+j] = card;
            }
        }

        for (int i=0; i<cards.length;i++) {
            System.out.println(cards[i].mark + cards[i].number);
        }
    }
}
