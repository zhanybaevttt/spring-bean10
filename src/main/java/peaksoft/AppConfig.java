package peaksoft;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean(name="helloworld")
    @Qualifier
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "Tom")
    @Scope("prototype")
    public Cat getBean(){
        return new Cat();
    }
}
