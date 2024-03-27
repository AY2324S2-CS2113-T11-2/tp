package seedu.duke.commands;

import seedu.duke.*;
import seedu.duke.exceptions.FlirtForkException;

import java.util.ArrayList;

public class FindFavouritesCommand extends Command {
    private String keyword;
    public FindFavouritesCommand(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public void execute(FavouritesList favourites, FoodList foods, ActivityList activities, Ui ui,
                        Storage storage, UserDetails userDetails, GiftList gifts) throws FlirtForkException {
        ArrayList<Favourites> matchingFavourites = favourites.findFavourites(keyword);
        ui.showMatchingFavourites(matchingFavourites);
    }
}