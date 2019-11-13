package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    @Override
    public int compare(Item e1, Item e2) {
        return e1.getName().compareTo(e2.getName());
    }
}