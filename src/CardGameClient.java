public class CardGameClient {
    public static void main(String[] args) throws Exception {
        
        Deck smelly = new Deck();
        smelly.shuffleCards();
        System.out.println(smelly.toString());

    }
}
