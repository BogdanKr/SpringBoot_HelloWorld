package spring.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
    @RequestMapping("/hello")
    public String showHelloWorld(){
        return "hello-world";
    }
}
