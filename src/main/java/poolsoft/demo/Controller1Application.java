package poolsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import poolsoft.model.M1;

@SpringBootApplication
public class Controller1Application {


    public static void main(String[] args) {
        M1 m1 = new M1();
        SpringApplication.run(Controller1Application.class, args);
    }

}
