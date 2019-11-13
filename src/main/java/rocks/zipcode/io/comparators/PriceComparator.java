package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item>{

        @Override
        public int compare(Item e1, Item e2) {
            if (e1.getPrice() < e2.getPrice()){
                return -1;
            }
            else if (e1.getPrice() == e2.getPrice()){
                return 0;
            }
            else return 1;
        }
    }

