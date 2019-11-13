package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

   @Override
    public int compare(Item e1, Item e2) {
            return (int) (e1.getId() - e2.getId());
        }
    }
