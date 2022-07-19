package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/indexResource", "/indexResource.html" }) // specify controller class for 1 parameter
public class indexResource {

    @GetMapping(produces = { "text/html" })
    public String index(Model model) {
        return "indexResource";
    }

}
