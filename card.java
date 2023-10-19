public class card {
    protected String typeOfCard;
    protected String numberOfTheCard;

    public card (String typeOfCard, String numberOfTheCard) {
        this.typeOfCard= typeOfCard;
        this.numberOfTheCard= numberOfTheCard;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getNumberOfTheCard() {
        return numberOfTheCard;
    }

    public void setNumberOfTheCard(String numberOfTheCard) {
        this.numberOfTheCard = numberOfTheCard;
    }
}
