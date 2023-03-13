package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingServiceImpl;
import guru.springframework.sfgdi.services.SetterInjectedGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingService () {
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingServiceImpl();
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingService() {
        return new SetterInjectedGreetingServiceImpl();
    }
}
