package in.jaiprakash.householdgroceries.service;

import in.jaiprakash.householdgroceries.dto.ItemDto;
import in.jaiprakash.householdgroceries.models.Item;

import java.util.List;

public interface IGroceryChecker {

    int generateItemNo();

    boolean generateNotification();

    void notifyOfExpiration();

    String locateAnItem();

    boolean authenticateUser();

    Item addAnItem(Item item);

    Item updateAnItem(Item item);

    boolean deleteAnItem(Item item);

    List<Item> getListOfAvailableItems();

}
