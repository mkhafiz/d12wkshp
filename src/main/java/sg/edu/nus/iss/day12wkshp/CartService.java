package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<item> getShoppingItems() {

        List<item> lstItems = new ArrayList<>();

        item itm = new item();
        itm.setItemName("Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("HP");
        itm.setQuantity(4);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Wallet");
        itm.setQuantity(9);
        lstItems.add(itm);

        return lstItems;

    }
    
}
