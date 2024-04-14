package seedu.flirtfork;

public class Food extends Favourites {
    protected String location;
    protected String price;
    protected String cuisine;
    protected String completionStatus;

    public Food(String description, String location, String price, String cuisine, String completionStatus) {
        super(description);
        this.location = location;
        this.price = price;
        this.cuisine = cuisine;
        this.completionStatus = completionStatus;
    }

    @Override
    public String toString() {
        return (description);
    }

    public void markComplete() {
        this.completionStatus = "C";
    }

    public String getCompletionStatus() {
        return completionStatus;
    }
}
