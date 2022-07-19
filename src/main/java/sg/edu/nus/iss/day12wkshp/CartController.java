package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//import sg.edu.nus.iss.day12wkshp.CartService;

@Controller
@RequestMapping(path = { "/cart" })
public class CartController {

    @GetMapping(produces = { "text/html" })
    public String displayCart(Model model) {

        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart"; // sensitive, referring to cart.html //inject into view
    }

    @GetMapping("{itemname}")
    public String filteredCart(
            @PathVariable(name = "itemname", required = true) String itemname, //pathvariable = weather/Singapore
            Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();

        List<Item> filtereItems = new ArrayList<>();
        for (Item s : cartItems) {
            if (s.getItemName().contains(itemname)) {
                filtereItems.add(s);
            }
        }

        model.addAttribute("cart", filtereItems);

        return "cart";
    }
}