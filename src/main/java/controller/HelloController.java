package controller;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @RequestMapping("show")
    public String handleRequest(Model model, HttpServletRequest request) throws Exception {
        System.out.println("目标方法执行......");
        String name = request.getParameter("name");
        System.out.println(name);
        model.addAttribute("msg", name);
        return "hello";
    }

    @RequestMapping("show2")
    @ResponseStatus(HttpStatus.OK)
    public void handleRequest2(Model model) throws Exception {
        System.out.println("22222222222222222222222222");
        int i = 1 / 0;
    }
}
