package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {

    @GetMapping("/goofy")
    public String getConsole(Model model){
        String name = "Count Goofula";
        model.addAttribute("name",name);
        System.out.println("Shoes");
        return "test";
    }


}
