package seedu.duke.commands;

import seedu.duke.*;
import seedu.duke.exceptions.FlirtForkException;


public class AddActivityCommand extends Command {
    private String description;
    public AddActivityCommand(String description) {
        this.description = description;
    }

    @Override
    public void execute(FavouritesList favourites, FoodList foods, ActivityList activities, Ui ui,
                        Storage storage, UserDetails userDetails, GiftList gifts) throws FlirtForkException {
        Activity activity = new Activity(description, "default location", "default price", "U");
        favourites.addFavourite(activity);
        System.out.println("Cupid's arrow strikes! This is now in your favourites. \n" + activity);
        ui.showFavourite("Guess what? You've collected " + favourites.getFavourites().size() +
                " romantic treasures!");
    }
}