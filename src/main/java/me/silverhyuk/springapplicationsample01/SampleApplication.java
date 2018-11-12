package me.silverhyuk.springapplicationsample01;

import me.silverhyuk.springapplicationsample01.listener.SampleStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SampleApplication.class);
        app.addListeners(new SampleStartingListener());
        //app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }
}
