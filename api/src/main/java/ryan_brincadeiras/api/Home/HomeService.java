package ryan_brincadeiras.api.Home;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    
    public String sayHello() {
        return "Hello, Ryan!";
    }

    public String sayMyName(String name) {
        return "Your name is " + name + "!";
    }
}
