package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<Item> getShoppingItems() {

        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("HP");
        itm.setQuantity(4);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Wallet");
        itm.setQuantity(9);
        lstItems.add(itm);

        return lstItems;

    }
    
}
