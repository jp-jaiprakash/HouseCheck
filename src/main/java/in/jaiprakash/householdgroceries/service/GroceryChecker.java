package in.jaiprakash.householdgroceries.service;

import in.jaiprakash.householdgroceries.dto.ItemDto;
import in.jaiprakash.householdgroceries.models.Item;
import in.jaiprakash.householdgroceries.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;


@Service
public class GroceryChecker implements IGroceryChecker{


    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    private List<Item> items;

    private static Integer startingItemNumber = 1;

    public GroceryChecker() {
        this.items = new ArrayList<>();
    }

    @Override
    public int generateItemNo() {
        startingItemNumber++;
        return startingItemNumber;
    }

    @Override
    public boolean generateNotification() {
        return false;
    }

    @Override
    public void notifyOfExpiration() {

    }

    @Override
    public String locateAnItem() {
        return null;
    }

    @Override
    public boolean authenticateUser() {
        return false;
    }

    @Override
    public Item addAnItem(Item item) {
        ItemDto itemDto = modelMapper.map(item, ItemDto.class);
        itemDto = itemRepo.save(itemDto);
        item = modelMapper.map(itemDto, Item.class);
        return item;
    }

    @Override
    public Item updateAnItem(Item item) {
        ItemDto itemDto = itemRepo.getReferenceById(item.getItemId());
        if(itemDto == null)
            throw new NoSuchElementException("No ");

        return addAnItem(item);
    }

    @Override
    public boolean deleteAnItem(Item item) {
        ItemDto itemDto = itemRepo.getReferenceById(item.getItemId());
        if(itemDto == null)
            throw new NoSuchElementException("No ");

        itemRepo.delete(itemDto);
        return true;
    }

    @Override
    public List<Item> getListOfAvailableItems() {
        return itemRepo.findAll().stream().map(x-> modelMapper.map(x, Item.class)).toList();
    }
}
