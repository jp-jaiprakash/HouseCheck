package in.jaiprakash.householdgroceries.utils;

import lombok.*;


@Getter
public enum QuantityUnit {

    KILOGRAM("KG"),
    LITER("L"),
    NUMBER("NO");

    public final String label;

    private QuantityUnit(String label){
        this.label = label;
    }

}
