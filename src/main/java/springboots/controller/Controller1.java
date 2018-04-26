package springboots.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Controller1 {

    @RequestMapping("/hello")
    public String test01(HttpServletRequest request){
        return "test";
    }


    @RequestMapping("/backendlogin")
    public String test02(HttpServletRequest request){

        return "devlogin";
    }


}
