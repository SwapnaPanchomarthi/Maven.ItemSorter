package rocks.zipcode.io;


//import com.sun.tools.javac.jvm.Items;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator <Item> comp ) {
        Arrays.sort(this.items, comp);
        return items;

    }
    }



