package in.jaiprakash.householdgroceries.models;

import lombok.Getter;

@Getter
public enum Category {

    GROCERY("Grocery");
    private final String  label;

    private Category(String label){
        this.label = label;
    }
}
