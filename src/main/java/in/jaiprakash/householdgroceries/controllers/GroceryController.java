package in.jaiprakash.householdgroceries.controllers;

import in.jaiprakash.householdgroceries.dto.ItemDto;
import in.jaiprakash.householdgroceries.models.Item;
import in.jaiprakash.householdgroceries.service.IGroceryChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController("/grocery")
public class GroceryController {

    @Autowired
    private IGroceryChecker iGroceryChecker;


    @GetMapping("/items")
    public ResponseEntity<List<Item>> getListOfiItems(Date endDt){

        List<Item> listOfAvailableItems = iGroceryChecker.getListOfAvailableItems();
        return new ResponseEntity<>(listOfAvailableItems, HttpStatus.OK);
    }

    @PostMapping("/addItem")
    public ResponseEntity<Item> addAnItem(@RequestBody Item item){
        item = iGroceryChecker.addAnItem(item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
}
