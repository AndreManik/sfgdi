package guru.springframework.sfgdi.services;

public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
