package ytr.ugur.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class AppConfig{

    @Value("${greeting}")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }
}