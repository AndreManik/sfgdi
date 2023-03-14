package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
