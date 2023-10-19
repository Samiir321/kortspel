public class card {
    public enum suitOfCard {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
    protected suitOfCard suit;

    protected String cardValue;

    public card (suitOfCard suit, String cardValue) {
        this.suit= suit;
        this.cardValue= cardValue;
    }

    public suitOfCard getSuit() {
        return suit;
    }

    public String getCardValue() {
        return cardValue;
    }

    public void setCardValue(String numberOfTheCard) {
        this.cardValue = numberOfTheCard;
    }
}
