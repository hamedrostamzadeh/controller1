package poolsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import poolsoft.model.M;

@SpringBootApplication
public class Controller1Application {


    public static void main(String[] args) {
        M m = new M();
        SpringApplication.run(Controller1Application.class, args);
    }

}
