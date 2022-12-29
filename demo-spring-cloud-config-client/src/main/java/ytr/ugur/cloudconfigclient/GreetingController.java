package ytr.ugur.cloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greetings")
public class GreetingController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping
    public String getGreeting() {
        return appConfig.getGreeting();
    }
}
