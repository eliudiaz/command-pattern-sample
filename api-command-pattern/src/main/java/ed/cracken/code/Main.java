package ed.cracken.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(Main.class);
        ConfigurableApplicationContext ctx = app.run(args);
    }
}
