package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @RequestMapping("show")
    public String  handleRequest(Model model) throws Exception {
        model.addAttribute("msg","数据");
        return "hello";
    }
}
